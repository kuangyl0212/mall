DROP TABLE IF EXISTS wms_purchase;

DROP TABLE IF EXISTS wms_purchase_detail;

DROP TABLE IF EXISTS wms_ware_info;

DROP TABLE IF EXISTS wms_ware_order_task;

DROP TABLE IF EXISTS wms_ware_order_task_detail;

DROP TABLE IF EXISTS wms_ware_sku;

/*==============================================================*/
/* Table: wms_purchase                                          */
/*==============================================================*/
CREATE TABLE wms_purchase
(
   id                   BIGINT NOT NULL AUTO_INCREMENT,
   assignee_id          BIGINT,
   assignee_name        VARCHAR(255),
   phone                CHAR(13),
   priority             INT(4),
   STATUS               INT(4),
   ware_id              BIGINT,
   amount               DECIMAL(18,4),
   create_time          DATETIME,
   update_time          DATETIME,
   PRIMARY KEY (id)
);

ALTER TABLE wms_purchase COMMENT '采购信息';

/*==============================================================*/
/* Table: wms_purchase_detail                                   */
/*==============================================================*/
CREATE TABLE wms_purchase_detail
(
   id                   BIGINT NOT NULL AUTO_INCREMENT,
   purchase_id          BIGINT COMMENT '采购单id',
   sku_id               BIGINT COMMENT '采购商品id',
   sku_num              INT COMMENT '采购数量',
   sku_price            DECIMAL(18,4) COMMENT '采购金额',
   ware_id              BIGINT COMMENT '仓库id',
   STATUS               INT COMMENT '状态[0新建，1已分配，2正在采购，3已完成，4采购失败]',
   PRIMARY KEY (id)
);

/*==============================================================*/
/* Table: wms_ware_info                                         */
/*==============================================================*/
CREATE TABLE wms_ware_info
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   NAME                 VARCHAR(255) COMMENT '仓库名',
   address              VARCHAR(255) COMMENT '仓库地址',
   areacode             VARCHAR(20) COMMENT '区域编码',
   PRIMARY KEY (id)
);

ALTER TABLE wms_ware_info COMMENT '仓库信息';

/*==============================================================*/
/* Table: wms_ware_order_task                                   */
/*==============================================================*/
CREATE TABLE wms_ware_order_task
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   order_id             BIGINT COMMENT 'order_id',
   order_sn             VARCHAR(255) COMMENT 'order_sn',
   consignee            VARCHAR(100) COMMENT '收货人',
   consignee_tel        CHAR(15) COMMENT '收货人电话',
   delivery_address     VARCHAR(500) COMMENT '配送地址',
   order_comment        VARCHAR(200) COMMENT '订单备注',
   payment_way          TINYINT(1) COMMENT '付款方式【 1:在线付款 2:货到付款】',
   task_status          TINYINT(2) COMMENT '任务状态',
   order_body           VARCHAR(255) COMMENT '订单描述',
   tracking_no          CHAR(30) COMMENT '物流单号',
   create_time          DATETIME COMMENT 'create_time',
   ware_id              BIGINT COMMENT '仓库id',
   task_comment         VARCHAR(500) COMMENT '工作单备注',
   PRIMARY KEY (id)
);

ALTER TABLE wms_ware_order_task COMMENT '库存工作单';

/*==============================================================*/
/* Table: wms_ware_order_task_detail                            */
/*==============================================================*/
CREATE TABLE wms_ware_order_task_detail
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   sku_id               BIGINT COMMENT 'sku_id',
   sku_name             VARCHAR(255) COMMENT 'sku_name',
   sku_num              INT COMMENT '购买个数',
   task_id              BIGINT COMMENT '工作单id',
   PRIMARY KEY (id)
);

ALTER TABLE wms_ware_order_task_detail COMMENT '库存工作单';

/*==============================================================*/
/* Table: wms_ware_sku                                          */
/*==============================================================*/
CREATE TABLE wms_ware_sku
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   sku_id               BIGINT COMMENT 'sku_id',
   ware_id              BIGINT COMMENT '仓库id',
   stock                INT COMMENT '库存数',
   sku_name             VARCHAR(200) COMMENT 'sku_name',
   stock_locked         INT COMMENT '锁定库存',
   PRIMARY KEY (id)
);

ALTER TABLE wms_ware_sku COMMENT '商品库存';