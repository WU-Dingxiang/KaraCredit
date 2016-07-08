DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `ID` int(32) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) NOT NULL,
  `price` int(32) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

LOCK TABLES `product` WRITE;
INSERT INTO `product` VALUES (1,'中南海特供吹风机',19800);
UNLOCK TABLES;

DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `ID` int(32) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `balance` int(32) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

LOCK TABLES `account` WRITE;
INSERT INTO `account` VALUES (1,'a123','123456',100000);
UNLOCK TABLES;



