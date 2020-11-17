/*
 Navicat Premium Data Transfer

 Source Server         : MyDbConn
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 18/11/2020 00:16:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `hobby` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '张三', 'women', '跳舞, rap', 12);
INSERT INTO `student` VALUES (4, '展示', 'men', '王五, 问问', 12);
INSERT INTO `student` VALUES (5, '维恩', 'men', '任务, we, eee, 问问, wewe', 34);
INSERT INTO `student` VALUES (6, '12312', 'men', '12, 23, red', 123);
INSERT INTO `student` VALUES (8, '234', 'men', '1, 12', 12);
INSERT INTO `student` VALUES (13, '徐明明', 'women', '', 12);

SET FOREIGN_KEY_CHECKS = 1;
