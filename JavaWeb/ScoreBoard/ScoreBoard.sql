-- MySQL dump 10.14  Distrib 5.5.60-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: ScoreBoard
-- ------------------------------------------------------
-- Server version	5.5.60-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `athletes`
--

DROP TABLE IF EXISTS `athletes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `athletes` (
  `id` int(11) NOT NULL COMMENT '运动员编号',
  `stu_num` varchar(20) DEFAULT NULL COMMENT '体育部运动员标号',
  `name` varchar(20) NOT NULL COMMENT '运动员名称',
  `sex` varchar(1) DEFAULT NULL COMMENT '性别',
  `college_id` int(11) DEFAULT NULL COMMENT '学院编号',
  `class_name` varchar(20) DEFAULT NULL COMMENT '班级',
  `isteam` int(11) DEFAULT NULL COMMENT '是否是团队',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `athletes`
--

LOCK TABLES `athletes` WRITE;
/*!40000 ALTER TABLE `athletes` DISABLE KEYS */;
/*!40000 ALTER TABLE `athletes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `college`
--

DROP TABLE IF EXISTS `college`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `college` (
  `id` int(11) NOT NULL COMMENT '编号',
  `name` varchar(20) DEFAULT NULL COMMENT '学院名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `college`
--

LOCK TABLES `college` WRITE;
/*!40000 ALTER TABLE `college` DISABLE KEYS */;
/*!40000 ALTER TABLE `college` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `connect`
--

DROP TABLE IF EXISTS `connect`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `connect` (
  `athletes_id` varchar(20) DEFAULT NULL COMMENT '运动员编号',
  `college_id` varchar(20) DEFAULT NULL COMMENT '学院编号',
  `match_project_id` varchar(20) DEFAULT NULL COMMENT '比赛编号',
  `rank` int(11) DEFAULT NULL COMMENT '排名',
  `grade` varchar(20) DEFAULT NULL COMMENT '分数'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `connect`
--

LOCK TABLES `connect` WRITE;
/*!40000 ALTER TABLE `connect` DISABLE KEYS */;
/*!40000 ALTER TABLE `connect` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `match_project`
--

DROP TABLE IF EXISTS `match_project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `match_project` (
  `id` int(11) NOT NULL COMMENT '比赛编号',
  `name` varchar(30) NOT NULL COMMENT '比赛名称',
  `type` int(11) DEFAULT NULL COMMENT '比赛类型',
  `time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `match_project`
--

LOCK TABLES `match_project` WRITE;
/*!40000 ALTER TABLE `match_project` DISABLE KEYS */;
/*!40000 ALTER TABLE `match_project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL COMMENT '编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '用户名',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-18  8:08:48
