/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.1.49-community : Database - karabay
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`karabay` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `karabay`;

/*Table structure for table `account_t` */

DROP TABLE IF EXISTS `account_t`;

CREATE TABLE `account_t` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `balance` int(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `account_t` */

insert  into `account_t`(`id`,`username`,`password`,`balance`) values (1,'a123','123456',100000);

/*Table structure for table `order_t` */

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

/*Data for the table `order_t` */

/*Table structure for table `product_t` */

DROP TABLE IF EXISTS `product_t`;

CREATE TABLE `product_t` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) NOT NULL,
  `price` int(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `product_t` */

insert  into `product_t`(`id`,`description`,`price`) values (1,'中南海特供吹风机',19800);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
