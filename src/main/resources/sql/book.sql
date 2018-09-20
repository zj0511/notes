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

 Date: 20/09/2018 23:42:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for n_book
-- ----------------------------
DROP TABLE IF EXISTS `n_book`;
CREATE TABLE `n_book` (
  `id` varchar(100) NOT NULL,
  `isbn` varchar(100) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  `categoryid` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of n_book
-- ----------------------------
BEGIN;
INSERT INTO `n_book` VALUES ('1', '9780980839623', 'C#: A Beginner\'s Tutprial', 'Jayden Ky', '1');
INSERT INTO `n_book` VALUES ('2', '9780980839623', 'Servlet & JSP: A Tutorial', 'Budi Kurniawan', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
