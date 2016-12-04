/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.1.49-community : Database - karacredit
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

DROP DATABASE IF EXISTS `karacredit`;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`karacredit` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `karacredit`;

/*Table structure for table `auth_t` */

DROP TABLE IF EXISTS `auth_t`;

CREATE TABLE `auth_t` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `phone` varchar(255) NOT NULL,
  `authType` int(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `product_t` */

insert  into `auth_t`(`id`,`phone`,`authType`) values (1,'13647449504',0);
insert  into `auth_t`(`id`,`phone`,`authType`) values (2,'15073923998',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
