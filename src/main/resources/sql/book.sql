/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : notes

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-10-09 10:42:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `n_book`
-- ----------------------------
DROP TABLE IF EXISTS `n_book`;
CREATE TABLE `n_book` (
  `id` varchar(11) NOT NULL,
  `isbn` varchar(100) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  `categoryid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of n_book
-- ----------------------------
INSERT INTO `n_book` VALUES ('1', '9780980839623', 'C#: A Beginner\'s Tutprial', 'Jayden Ky', '1');
INSERT INTO `n_book` VALUES ('2', '9780980839623', 'Servlet & JSP: A Tutorial', 'Budi Kurniawan', '1');
