
DROP DATABASE IF EXISTS `karabay`;
CREATE DATABASE `karabay`;
USE `karabay`;


/* 商品表 - 创建 */
DROP TABLE IF EXISTS `product_t`;
CREATE TABLE `product_t` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) NOT NULL,
  `price` int(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/* 商品表 - 插入 */
LOCK TABLES `product_t` WRITE;
INSERT INTO `product_t` VALUES (1,'中南海特供吹风机',19800);
UNLOCK TABLES;

/* 账户表 - 创建 */
DROP TABLE IF EXISTS `account_t`;
CREATE TABLE `account_t` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `balance` int(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/* 账户表 - 插入 */
LOCK TABLES `account_t` WRITE;
INSERT INTO `account_t` VALUES (1,'a123','123456',100000);
UNLOCK TABLES;

/* 订单表 - 创建 */
DROP TABLE IF EXISTS `order_t`;
CREATE TABLE `order_t` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `product_id` int(32) NOT NULL,
  `amount` int(32) NOT NULL,
  `address` varchar(255) NOT NULL,
  `cellphone` varchar(255) NOT NULL,
  `status` int(8) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;



