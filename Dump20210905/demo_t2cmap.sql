-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: demo
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t2cmap`
--

DROP TABLE IF EXISTS `t2cmap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t2cmap` (
  `TEACHER_ID` int unsigned NOT NULL,
  `Teacher_Name` varchar(255) DEFAULT NULL,
  `Class_Code` int unsigned NOT NULL,
  PRIMARY KEY (`TEACHER_ID`,`Class_Code`),
  KEY `TEACHER_ID` (`TEACHER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t2cmap`
--

LOCK TABLES `t2cmap` WRITE;
/*!40000 ALTER TABLE `t2cmap` DISABLE KEYS */;
INSERT INTO `t2cmap` VALUES (1,'Gopinath',1),(1,'Gopinath',2),(1,'Gopinath',3),(1,'Gopinath',4),(1,'Gopinath',5),(1,'Gopinath',6),(1,'Gopinath',7),(2,'Jagdish',5),(2,'Jagdish',6),(2,'Jagdish',7),(4,'Jagganath',5),(4,'Jagganath',6),(4,'Jagganath',7),(5,'Dharmendra',1),(5,'Dharmendra',2),(5,'Dharmendra',3),(5,'Dharmendra',4),(5,'Dharmendra',5),(5,'Dharmendra',6),(5,'Dharmendra',7),(8,'Gautam',5),(8,'Gautam',6),(8,'Gautam',7),(9,'Vijay',6),(9,'Vijay',7);
/*!40000 ALTER TABLE `t2cmap` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-05  0:10:37
