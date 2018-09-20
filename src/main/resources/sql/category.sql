/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost:3306
 Source Schema         : notes

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 20/09/2018 23:42:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for n_category
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
BEGIN;
INSERT INTO `n_category` VALUES ('1', 'Computing');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
