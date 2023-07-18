/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80026
Source Host           : localhost:3306
Source Database       : book

Target Server Type    : MYSQL
Target Server Version : 80026
File Encoding         : 65001

Date: 2023-07-18 10:26:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `price` decimal(11,2) DEFAULT NULL,
  `author` varchar(100) DEFAULT NULL,
  `sales` int DEFAULT NULL,
  `stock` int DEFAULT NULL,
  `img_path` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of t_book
-- ----------------------------
INSERT INTO `t_book` VALUES ('22', 'javaScript 高级编程', '69.15', '国哥', '2100', '8100', 'static/img/default.jpg');
INSERT INTO `t_book` VALUES ('23', '大话设计模式', '89.15', '国哥', '20', '10', 'static/img/default.jpg');
INSERT INTO `t_book` VALUES ('24', '人月神话', '88.15', '刚哥', '20', '80', 'static/img/default.jpg');
INSERT INTO `t_book` VALUES ('42', '时间简史', '30.00', '霍金', '3456', '300', 'static/img/default.jpg');
INSERT INTO `t_book` VALUES ('43', '哪些年追富哦1', '11.00', '小溪流', '1234', '1234', 'static/img/default.jpg');
INSERT INTO `t_book` VALUES ('46', '教你如何阅读', '12.33', '小军', '222', '2', 'static/img/default.jpg');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  `email` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', 'admin', 'admin@atguigu.com');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `NAME` varchar(30) DEFAULT NULL,
  `id` int DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('小王', '2', '女');
INSERT INTO `user` VALUES ('356456', '3', '女');
INSERT INTO `user` VALUES ('7907 ', '56', '男');
INSERT INTO `user` VALUES ('6789678', '546', '67');
INSERT INTO `user` VALUES ('78907890', '6789', '7890789');
INSERT INTO `user` VALUES ('78907890', '5769867', '7987890');
INSERT INTO `user` VALUES ('89078907', '456756', '67585678');
INSERT INTO `user` VALUES ('45674567', '5674567', '67454567');
