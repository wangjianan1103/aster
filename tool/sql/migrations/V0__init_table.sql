/*
MariaDB Data Transfer

Source Server         : local
Source Server Version : 50544
Source Host           : 127.0.0.1:3306
Source Database       : core

Target Server Type    : MariaDB
Target Server Version : 50544
File Encoding         : 65001

Date: 2015-11-24 17:36:35
*/

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS aster.config_product;
CREATE TABLE aster.config_product (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gid` varchar(50) NOT NULL COMMENT '唯一主键',
  `create_time` int(11) DEFAULT NULL COMMENT '创建时间',
  `update_time` int(11) DEFAULT NULL COMMENT '更新时间',
  `name` varchar(50) DEFAULT NULL COMMENT '商品品牌名称',
  `img_url` varchar(256) DEFAULT NULL COMMENT '图片路径',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `content` longtext COMMENT '内容',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gid` (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品配置表';

DROP TABLE IF EXISTS aster.product;
CREATE TABLE aster.product (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gid` varchar(50) NOT NULL COMMENT '唯一主键',
  `create_time` int(11) DEFAULT NULL COMMENT '创建时间',
  `update_time` int(11) DEFAULT NULL COMMENT '更新时间',
  `config_gid` varchar(50) NOT NULL COMMENT '配置gid',
  `name` varchar(50) DEFAULT NULL COMMENT '产品名称',
  `img_url` varchar(256) DEFAULT NULL COMMENT '图片路径',
  `shop_price` decimal(15,4) default '0.0000' not null COMMENT '商品金额',
  `view_type` int(11) NOT NULL DEFAULT '0' COMMENT '显示类型: 0 新品; 1 店长推荐; 2 热品推荐;',
  `stock` int(11) NOT NULL DEFAULT '0' COMMENT '库存',
  `views` int(11) NOT NULL DEFAULT '0' COMMENT '查看次数',
  `shops` int(11) NOT NULL DEFAULT '0' COMMENT '购买次数',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `content` longtext COMMENT '内容',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gid` (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';

DROP TABLE IF EXISTS aster.product_image;
CREATE TABLE aster.product_image (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gid` varchar(50) NOT NULL COMMENT '唯一主键',
  `create_time` int(11) DEFAULT NULL COMMENT '创建时间',
  `update_time` int(11) DEFAULT NULL COMMENT '更新时间',
  `name` varchar(50) DEFAULT NULL COMMENT '图片名称',
  `img_url` varchar(256) DEFAULT NULL COMMENT '图片路径',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `description` VARCHAR(128)  NULL COMMENT '描述',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gid` (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品图片表';

DROP TABLE IF EXISTS aster.config_product_image;
create table aster.config_product_image(
	id int(11) not null auto_increment,
	gid varchar(50) not null COMMENT '唯一主键',
  create_time int(11) null COMMENT '创建时间',
	update_time int(11) null COMMENT '更新时间',
	product_gid varchar(50) not null COMMENT '商品gid',
	image_gid varchar(50) not null COMMENT '图片gid',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gid` (`gid`)
);

DROP TABLE IF EXISTS aster.`user_base`;
CREATE TABLE aster.`user_base` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gid` char(36) NOT NULL COMMENT 'gid',
  `create_time` int(11) NOT NULL COMMENT '创建时间',
  `update_time` int(11) NOT NULL COMMENT '更新时间',
  `nickname` varchar(64) DEFAULT NULL COMMENT '昵称',
  `mobile` varchar(64) NOT NULL DEFAULT '0' COMMENT '手机',
  `name` varchar(64) DEFAULT NULL COMMENT '姓名',
  `id_card` varchar(64) DEFAULT NULL COMMENT '身份证号',
  `login_pwd_hash` VARCHAR(64) DEFAULT NULL COMMENT '登录密码',
  `user_state` int(11) NOT NULL DEFAULT '0' COMMENT '0：正常；1：冻结；2：解绑；3：注销；4：交易密码锁定',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_gid` (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

DROP TABLE IF EXISTS aster.`config_banner`;
CREATE TABLE aster.config_banner (
  id                 INT           NOT NULL AUTO_INCREMENT
    PRIMARY KEY,
  create_time        INT           NOT NULL COMMENT '创建时间',
  update_time        INT           NOT NULL COMMENT '更新时间',
  title              VARCHAR(128)  NULL COMMENT '标题',
  image_url          VARCHAR(2048) NOT NULL COMMENT '图片url',
  target_url         VARCHAR(2048) NULL COMMENT '点击跳转url',
  display_start_time INT           NOT NULL COMMENT '生效开始时间',
  display_end_time   INT           NOT NULL COMMENT '生效结束时间',
  display_sequence   INT           NOT NULL COMMENT '展示顺序',
  position_index     INT           NOT NULL COMMENT '位置',
  description        VARCHAR(128)  NULL COMMENT '描述'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='首页banner';


############## init data #####################
BEGIN ;
SET @YueYeGid = UUID() ;
SET @PaoGid = UUID() ;
SET @Product_01 = uuid();
SET @Product_02 = uuid();
SET @Product_03 = uuid();
SET @Product_04 = uuid();
SET @Image_01 = uuid();
SET @Image_02 = uuid();
SET @Image_03 = uuid();
SET @Image_04 = uuid();

## config_product
INSERT INTO aster.config_product (gid, create_time, update_time, name, img_url)
VALUES (@YueYeGid, unix_timestamp(), unix_timestamp(), '越野', 'http://og4nfuylr.bkt.clouddn.com/jeep201402.png');
INSERT INTO aster.config_product (gid, create_time, update_time, name, img_url)
VALUES (@PaoGid, unix_timestamp(), unix_timestamp(), '跑车', 'http://og4nfuylr.bkt.clouddn.com/03.png');

## product
INSERT INTO aster.product (gid, create_time, update_time, config_gid, name, img_url, shop_price, view_type, stock, views, shops, is_valid, content)
VALUES (@Product_01, unix_timestamp(), unix_timestamp(), @YueYeGid, '吉普牧马人软顶（撒哈拉）', 'http://og4nfuylr.bkt.clouddn.com/03.png', 499, 0, 10, DEFAULT, DEFAULT, DEFAULT, '吉普牧马人软顶（撒哈拉）');
INSERT INTO aster.product (gid, create_time, update_time, config_gid, name, img_url, shop_price, view_type, stock, views, shops, is_valid, content)
VALUES (@Product_02, unix_timestamp(), unix_timestamp(), @YueYeGid, '2014年牧马人', 'http://og4nfuylr.bkt.clouddn.com/jeep201402.png', 599, 1, 10, DEFAULT, DEFAULT, DEFAULT, '2014年牧马人');
INSERT INTO aster.product (gid, create_time, update_time, config_gid, name, img_url, shop_price, view_type, stock, views, shops, is_valid, content)
VALUES (@Product_03, unix_timestamp(), unix_timestamp(), @PaoGid, '兰博基尼蝙蝠敞棚', 'http://og4nfuylr.bkt.clouddn.com/03.png', 899, 2, 10, DEFAULT, DEFAULT, DEFAULT, '兰博基尼蝙蝠敞棚');
INSERT INTO aster.product (gid, create_time, update_time, config_gid, name, img_url, shop_price, view_type, stock, views, shops, is_valid, content)
VALUES (@Product_04, unix_timestamp(), unix_timestamp(), @PaoGid, '大黄蜂', 'http://og4nfuylr.bkt.clouddn.com/dahuangfeng.png', 699, 2, 10, DEFAULT, DEFAULT, DEFAULT, '大黄蜂');

## product_image
INSERT INTO aster.product_image (gid, create_time, update_time, name, img_url, is_valid, description)
VALUES (@Image_01, unix_timestamp(), unix_timestamp(), '吉普牧马人软顶（撒哈拉）', 'http://og4nfuylr.bkt.clouddn.com/03.png', DEFAULT, 'NULL');
INSERT INTO aster.product_image (gid, create_time, update_time, name, img_url, is_valid, description)
VALUES (@Image_02, unix_timestamp(), unix_timestamp(), '2014年牧马人', 'http://og4nfuylr.bkt.clouddn.com/jeep201402.png', DEFAULT, 'NULL');
INSERT INTO aster.product_image (gid, create_time, update_time, name, img_url, is_valid, description)
VALUES (@Image_03, unix_timestamp(), unix_timestamp(), '兰博基尼蝙蝠敞棚', 'http://og4nfuylr.bkt.clouddn.com/03.png', DEFAULT, 'NULL');
INSERT INTO aster.product_image (gid, create_time, update_time, name, img_url, is_valid, description)
VALUES (@Image_04, unix_timestamp(), unix_timestamp(), '大黄蜂', 'http://og4nfuylr.bkt.clouddn.com/dahuangfeng.png', DEFAULT, 'NULL');

## config_product_image
INSERT INTO aster.config_product_image (gid, create_time, update_time, product_gid, image_gid)
VALUES (uuid(), unix_timestamp(), unix_timestamp(), @Product_01, @Image_01);
INSERT INTO aster.config_product_image (gid, create_time, update_time, product_gid, image_gid)
VALUES (uuid(), unix_timestamp(), unix_timestamp(), @Product_01, @Image_02);
INSERT INTO aster.config_product_image (gid, create_time, update_time, product_gid, image_gid)
VALUES (uuid(), unix_timestamp(), unix_timestamp(), @Product_01, @Image_03);

INSERT INTO aster.config_product_image (gid, create_time, update_time, product_gid, image_gid)
VALUES (uuid(), unix_timestamp(), unix_timestamp(), @Product_02, @Image_04);
INSERT INTO aster.config_product_image (gid, create_time, update_time, product_gid, image_gid)
VALUES (uuid(), unix_timestamp(), unix_timestamp(), @Product_02, @Image_02);
INSERT INTO aster.config_product_image (gid, create_time, update_time, product_gid, image_gid)
VALUES (uuid(), unix_timestamp(), unix_timestamp(), @Product_02, @Image_03);

INSERT INTO aster.config_product_image (gid, create_time, update_time, product_gid, image_gid)
VALUES (uuid(), unix_timestamp(), unix_timestamp(), @Product_03, @Image_01);
INSERT INTO aster.config_product_image (gid, create_time, update_time, product_gid, image_gid)
VALUES (uuid(), unix_timestamp(), unix_timestamp(), @Product_03, @Image_04);
INSERT INTO aster.config_product_image (gid, create_time, update_time, product_gid, image_gid)
VALUES (uuid(), unix_timestamp(), unix_timestamp(), @Product_03, @Image_03);

INSERT INTO aster.config_product_image (gid, create_time, update_time, product_gid, image_gid)
VALUES (uuid(), unix_timestamp(), unix_timestamp(), @Product_04, @Image_01);
INSERT INTO aster.config_product_image (gid, create_time, update_time, product_gid, image_gid)
VALUES (uuid(), unix_timestamp(), unix_timestamp(), @Product_04, @Image_02);
INSERT INTO aster.config_product_image (gid, create_time, update_time, product_gid, image_gid)
VALUES (uuid(), unix_timestamp(), unix_timestamp(), @Product_04, @Image_03);
## config_banner
INSERT INTO aster.config_banner (create_time, update_time, title, image_url, target_url, display_start_time, display_end_time, display_sequence, position_index, description)
VALUES (unix_timestamp(), unix_timestamp(), '吉普牧马人软顶（撒哈拉）', 'http://og4nfuylr.bkt.clouddn.com/jeep01.png', 'NULL', unix_timestamp(), unix_timestamp() + 86400 * 100, 2, 1, '首页bannel');
INSERT INTO aster.config_banner (create_time, update_time, title, image_url, target_url, display_start_time, display_end_time, display_sequence, position_index, description)
VALUES (unix_timestamp(), unix_timestamp(), '大黄蜂', 'http://og4nfuylr.bkt.clouddn.com/dahuangfeng.png', 'NULL', unix_timestamp(), unix_timestamp() + 86400 * 100, 1, 1, '首页bannel');
INSERT INTO aster.config_banner (create_time, update_time, title, image_url, target_url, display_start_time, display_end_time, display_sequence, position_index, description)
VALUES (unix_timestamp(), unix_timestamp(), '兰博基尼蝙蝠敞棚', 'http://og4nfuylr.bkt.clouddn.com/03.png', 'NULL', unix_timestamp(), unix_timestamp() + 86400 * 100, 1, 1, '首页bannel');

COMMIT;