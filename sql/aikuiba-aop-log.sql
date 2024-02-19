/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80031 (8.0.31)
 Source Host           : localhost:3306
 Source Schema         : aikuiba-aop-log

 Target Server Type    : MySQL
 Target Server Version : 80031 (8.0.31)
 File Encoding         : 65001

 Date: 19/02/2024 20:19:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_logs
-- ----------------------------
DROP TABLE IF EXISTS `t_logs`;
CREATE TABLE `t_logs` (
  `id` bigint NOT NULL,
  `user_id` bigint DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `class_name` varchar(255) DEFAULT NULL,
  `method_name` varchar(255) DEFAULT NULL,
  `method_params` varchar(255) DEFAULT NULL,
  `return_value` varchar(255) DEFAULT NULL,
  `cost_time` bigint DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `deleted` int DEFAULT '0',
  `version` int DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of t_logs
-- ----------------------------
BEGIN;
INSERT INTO `t_logs` (`id`, `user_id`, `username`, `create_at`, `class_name`, `method_name`, `method_params`, `return_value`, `cost_time`, `ip`, `deleted`, `version`) VALUES (1759529316485435394, 1, '小至', '2024-02-19 18:44:14', 'cn.aikuiba.controller.TestController', 'getOne', '[]', '123', 4, '127.0.0.1', NULL, NULL);
INSERT INTO `t_logs` (`id`, `user_id`, `username`, `create_at`, `class_name`, `method_name`, `method_params`, `return_value`, `cost_time`, `ip`, `deleted`, `version`) VALUES (1759540389057949698, 1, '小至', '2024-02-19 19:28:14', 'cn.aikuiba.controller.UserController', 'addUser', '[User(id=1759540387887738882, username=郝洋, password=tempor, nickName=薛娟, age=60, deleted=null, version=null)]', 'OK', 305, '127.0.0.1', 0, 0);
INSERT INTO `t_logs` (`id`, `user_id`, `username`, `create_at`, `class_name`, `method_name`, `method_params`, `return_value`, `cost_time`, `ip`, `deleted`, `version`) VALUES (1759542895234273282, 1, '小至', '2024-02-19 19:38:12', 'cn.aikuiba.controller.UserController', 'addUser', '[User(id=1759542895154581505, username=彭丽, password=ex in et, nickName=邵涛, age=52, deleted=null, version=null)]', 'R(message=SUCCESS, code=200, data=null, success=true)', 17, '127.0.0.1', 0, 0);
COMMIT;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `deleted` int DEFAULT '0',
  `version` int DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of t_user
-- ----------------------------
BEGIN;
INSERT INTO `t_user` (`id`, `username`, `password`, `nick_name`, `age`, `deleted`, `version`) VALUES (1759540387887738882, '郝洋', 'tempor', '薛娟', 60, 0, 0);
INSERT INTO `t_user` (`id`, `username`, `password`, `nick_name`, `age`, `deleted`, `version`) VALUES (1759542895154581505, '彭丽', 'ex in et', '邵涛', 52, 0, 0);
INSERT INTO `t_user` (`id`, `username`, `password`, `nick_name`, `age`, `deleted`, `version`) VALUES (1759543193478668289, '卢洋', 'ullamco ipsum', '崔刚', 19, 0, 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
