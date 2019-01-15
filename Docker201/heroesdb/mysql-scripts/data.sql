CREATE DATABASE IF NOT EXISTS heroesdb;
use heroesdb;
   CREATE TABLE IF NOT EXISTS `hero` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
INSERT INTO `heroesdb`.`hero` (`name`) VALUES ('Ms. Super Pow');
INSERT INTO `heroesdb`.`hero` (`name`) VALUES ('Mr. Ninja');
