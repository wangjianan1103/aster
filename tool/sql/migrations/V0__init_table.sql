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
CREATE TABLE aster.config_product (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gid` varchar(50) NOT NULL COMMENT '唯一主键',
  `create_time` int(11) DEFAULT NULL COMMENT '创建时间',
  `update_time` int(11) DEFAULT NULL COMMENT '更新时间',
  `name` varchar(50) DEFAULT NULL COMMENT '产品名称',
  `img_url` varchar(256) DEFAULT NULL COMMENT '图片路径',
  `shop_price` decimal(15,4) default '0.0000' not null COMMENT '商品金额',
  `promote_price` decimal(15,4) default '0.0000' not null COMMENT '促销金额',
  `is_new` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否新品',
  `is_boss` tinyint(1) NOT NULL DEFAULT '0' COMMENT '店长推荐',
  `is_hot` tinyint(1) NOT NULL DEFAULT '0' COMMENT '热品推荐',
  `views` int(11) NOT NULL DEFAULT '0' COMMENT '查看次数',
  `shops` int(11) NOT NULL DEFAULT '0' COMMENT '购买次数',
  `is_valid` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否有效',
  `content` longtext COMMENT '内容',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gid` (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';


CREATE TABLE config_banner (
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
);
