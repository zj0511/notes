/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : notes

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-10-09 10:42:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `n_category`
-- ----------------------------
DROP TABLE IF EXISTS `n_category`;
CREATE TABLE `n_category` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of n_category
-- ----------------------------
INSERT INTO `n_category` VALUES ('1', 'Computing');
INSERT INTO `n_category` VALUES ('2', 'Travel');
INSERT INTO `n_category` VALUES ('3', 'Health');
