-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: sistemapagoscolegio
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `sistemapagoscolegio`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `sistemapagoscolegio` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `sistemapagoscolegio`;

--
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno` (
  `ID_ALUMNO` int(11) NOT NULL AUTO_INCREMENT,
  `CODIGO_ALUMNO` varchar(15) NOT NULL,
  `ID_GENERO` int(11) DEFAULT NULL,
  `PRIMER_NOMBRE` varchar(25) DEFAULT NULL,
  `SEGUNDO_NOMBRE` varchar(25) DEFAULT NULL,
  `TERCER_NOMBRE` varchar(25) DEFAULT NULL,
  `PRIMER_APELLIDO` varchar(25) DEFAULT NULL,
  `SEGUNDO_APELLIDO` varchar(25) DEFAULT NULL,
  `FECHA_NAC` date DEFAULT NULL,
  `PARENTEZCO_ENCARGADO` varchar(25) DEFAULT NULL,
  `NOMBRE_ENCARGADO` varchar(25) DEFAULT NULL,
  `APELLIDO_ENCARGADO` varchar(25) DEFAULT NULL,
  `NUMERO_ENCARGADO` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`ID_ALUMNO`,`CODIGO_ALUMNO`),
  KEY `FK_GENERO_ALUMNO` (`ID_GENERO`),
  CONSTRAINT `FK_GENERO_ALUMNO` FOREIGN KEY (`ID_GENERO`) REFERENCES `genero` (`ID_GENERO`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
INSERT INTO `alumno` VALUES (1,'0001',1,'Maria','Ximena','','Saravia','Castro','2010-01-01','','','',''),(2,'0002',1,'Álvaro','Javier',NULL,'Castillo','Orellana',NULL,NULL,NULL,NULL,NULL),(3,'0006',1,'Dulce','','','Samayoa','','2018-08-01','','','',''),(4,'0007',1,'Dulce','','','Arriaga','Castro','2019-09-01','','','','');
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asignacion_grado`
--

DROP TABLE IF EXISTS `asignacion_grado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignacion_grado` (
  `id_asignar` int(11) NOT NULL AUTO_INCREMENT,
  `id_grado` int(11) DEFAULT NULL,
  `id_catedratico` int(11) DEFAULT NULL,
  `codigo_catedratico` varchar(15) DEFAULT NULL,
  `anio` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_asignar`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignacion_grado`
--

LOCK TABLES `asignacion_grado` WRITE;
/*!40000 ALTER TABLE `asignacion_grado` DISABLE KEYS */;
INSERT INTO `asignacion_grado` VALUES (1,1,1,'C-001',2019),(2,1,1,'C-001',2018),(3,2,2,'c-002',2018),(4,2,2,'c-002',2019),(5,2,2,'c-002',2017),(6,3,1,'C-001',2020),(7,4,1,'C-001',2020),(8,9,1,'C-001',2019),(9,11,1,'C-001',2019),(10,5,1,'C-001',2019),(11,5,2,'c-002',2020);
/*!40000 ALTER TABLE `asignacion_grado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asistencia`
--

DROP TABLE IF EXISTS `asistencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asistencia` (
  `ID_ASISTENCIA` int(11) NOT NULL AUTO_INCREMENT,
  `ID_CATEDRATICO` int(11) DEFAULT NULL,
  `CODIGO_CATEDRATICO` varchar(15) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `HORA_ENTRADA` varchar(25) DEFAULT NULL,
  `HORA_SALIDA` varchar(25) DEFAULT NULL,
  `OBSERVACION_ASISTENCIA` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_ASISTENCIA`),
  KEY `FK_CATEDRATICO_ASISTENCIAS` (`ID_CATEDRATICO`,`CODIGO_CATEDRATICO`),
  CONSTRAINT `FK_CATEDRATICO_ASISTENCIAS` FOREIGN KEY (`ID_CATEDRATICO`, `CODIGO_CATEDRATICO`) REFERENCES `catedraticos` (`ID_CATEDRATICO`, `CODIGO_CATEDRATICO`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asistencia`
--

LOCK TABLES `asistencia` WRITE;
/*!40000 ALTER TABLE `asistencia` DISABLE KEYS */;
INSERT INTO `asistencia` VALUES (5,1,'C-001','2019-10-28','22:38:33','22:39:48',''),(10,1,'C-001','2019-10-29','23:42:59','23:44:00',''),(11,1,'C-001','2019-10-30','00:14:56','11:29:11',''),(12,2,'c-002','2019-10-30','11:30:17','11:30:39','');
/*!40000 ALTER TABLE `asistencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `becas`
--

DROP TABLE IF EXISTS `becas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `becas` (
  `ID_BECA` int(11) NOT NULL AUTO_INCREMENT,
  `TIPO_BECA` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID_BECA`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `becas`
--

LOCK TABLES `becas` WRITE;
/*!40000 ALTER TABLE `becas` DISABLE KEYS */;
INSERT INTO `becas` VALUES (1,'Ninguna'),(2,'Media'),(3,'Completa');
/*!40000 ALTER TABLE `becas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bitacora`
--

DROP TABLE IF EXISTS `bitacora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bitacora` (
  `ID_BITACORA` int(11) NOT NULL AUTO_INCREMENT,
  `ID_USUARIO` int(11) DEFAULT NULL,
  `FECHAHORA_BITACORA` datetime DEFAULT NULL,
  `USUARIO_BIT` varchar(25) DEFAULT NULL,
  `ACCION` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_BITACORA`),
  KEY `FK_USUARIO_BITACORA` (`ID_USUARIO`),
  CONSTRAINT `FK_USUARIO_BITACORA` FOREIGN KEY (`ID_USUARIO`) REFERENCES `usuarios` (`ID_USUARIO`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bitacora`
--

LOCK TABLES `bitacora` WRITE;
/*!40000 ALTER TABLE `bitacora` DISABLE KEYS */;
/*!40000 ALTER TABLE `bitacora` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catedraticos`
--

DROP TABLE IF EXISTS `catedraticos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `catedraticos` (
  `ID_CATEDRATICO` int(11) NOT NULL AUTO_INCREMENT,
  `CODIGO_CATEDRATICO` varchar(15) NOT NULL,
  `ID_GENERO` int(11) DEFAULT NULL,
  `ID_ESTADO` int(11) DEFAULT NULL,
  `PRIMERNOMBRE_CATEDRATICO` varchar(25) DEFAULT NULL,
  `SEGUNDONOMBRE_CATEDRATICO` varchar(25) DEFAULT NULL,
  `TERCERNOMBRE_CATEDRATICO` varchar(25) DEFAULT NULL,
  `PRIMERAPELLIDO_CATEDRATICO` varchar(25) DEFAULT NULL,
  `SEGUNDOAPELLIDO_CATEDRATICO` varchar(25) DEFAULT NULL,
  `NUMERO_CATEDRATICO` varchar(25) DEFAULT NULL,
  `CORREO_CATEDRATICO` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_CATEDRATICO`,`CODIGO_CATEDRATICO`),
  KEY `FK_CATEDRATICOS_ESTADO` (`ID_ESTADO`),
  KEY `FK_GENERO_CATEDRATICO` (`ID_GENERO`),
  CONSTRAINT `FK_CATEDRATICOS_ESTADO` FOREIGN KEY (`ID_ESTADO`) REFERENCES `estado` (`ID_ESTADO`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_GENERO_CATEDRATICO` FOREIGN KEY (`ID_GENERO`) REFERENCES `genero` (`ID_GENERO`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catedraticos`
--

LOCK TABLES `catedraticos` WRITE;
/*!40000 ALTER TABLE `catedraticos` DISABLE KEYS */;
INSERT INTO `catedraticos` VALUES (1,'C-001',1,NULL,'Lucía','','','Jimenez','','','lucia@gmail.com'),(2,'c-002',2,NULL,'Jorge','','','Zamora','','','jorge@gmail.com');
/*!40000 ALTER TABLE `catedraticos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ciclo_escolar`
--

DROP TABLE IF EXISTS `ciclo_escolar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ciclo_escolar` (
  `ID_CICLO` int(11) NOT NULL AUTO_INCREMENT,
  `ANIO` int(11) DEFAULT NULL,
  `DESCRIPCION_CICLO` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_CICLO`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciclo_escolar`
--

LOCK TABLES `ciclo_escolar` WRITE;
/*!40000 ALTER TABLE `ciclo_escolar` DISABLE KEYS */;
INSERT INTO `ciclo_escolar` VALUES (1,2019,NULL);
/*!40000 ALTER TABLE `ciclo_escolar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cursos`
--

DROP TABLE IF EXISTS `cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursos` (
  `ID_CURSO` int(11) NOT NULL AUTO_INCREMENT,
  `ID_HORARIO` int(11) DEFAULT NULL,
  `ID_GRADO` int(11) DEFAULT NULL,
  `CURSO` varchar(25) DEFAULT NULL,
  `DESCRIPCION` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_CURSO`),
  KEY `FK_GRADO_CURSO` (`ID_GRADO`),
  KEY `FK_HORARIO_CURSO` (`ID_HORARIO`),
  CONSTRAINT `FK_GRADO_CURSO` FOREIGN KEY (`ID_GRADO`) REFERENCES `grado` (`ID_GRADO`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_HORARIO_CURSO` FOREIGN KEY (`ID_HORARIO`) REFERENCES `horario` (`ID_HORARIO`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursos`
--

LOCK TABLES `cursos` WRITE;
/*!40000 ALTER TABLE `cursos` DISABLE KEYS */;
INSERT INTO `cursos` VALUES (1,NULL,NULL,NULL,NULL),(2,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `cursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_recibo`
--

DROP TABLE IF EXISTS `detalle_recibo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_recibo` (
  `ID_DETALLE_RECIBO` int(11) NOT NULL AUTO_INCREMENT,
  `no_recibo` varchar(45) DEFAULT NULL,
  `ID_FORMA_PAGO` int(11) DEFAULT NULL,
  `ID_MORA` int(11) DEFAULT NULL,
  `ID_MES_PAGO` int(11) DEFAULT NULL,
  `CONCEPTO_PAGO` varchar(15) DEFAULT NULL,
  `IMPORTE` decimal(8,2) DEFAULT NULL,
  `MORA` decimal(8,2) DEFAULT NULL,
  `SUBTOTAL` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`ID_DETALLE_RECIBO`),
  KEY `FK_DETALLERECIBO_FORMAPAGO` (`ID_FORMA_PAGO`),
  KEY `FK_DETALLERECIBO_MESPAGADO` (`ID_MES_PAGO`),
  KEY `FK_MORA_DETALLE_RECIBO` (`ID_MORA`),
  CONSTRAINT `FK_DETALLERECIBO_FORMAPAGO` FOREIGN KEY (`ID_FORMA_PAGO`) REFERENCES `forma_pago` (`ID_FORMA_PAGO`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_DETALLERECIBO_MESPAGADO` FOREIGN KEY (`ID_MES_PAGO`) REFERENCES `meses_pago` (`ID_MES_PAGO`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_MORA_DETALLE_RECIBO` FOREIGN KEY (`ID_MORA`) REFERENCES `mora` (`ID_MORA`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_recibo`
--

LOCK TABLES `detalle_recibo` WRITE;
/*!40000 ALTER TABLE `detalle_recibo` DISABLE KEYS */;
INSERT INTO `detalle_recibo` VALUES (2,'323',1,1,0,'Inscripción',100.00,5.00,105.00),(3,'329',1,1,0,'Inscripción',120.00,0.00,120.00),(4,'327',1,1,1,'Colegiatura',120.00,5.00,125.00),(5,'328',1,1,2,'Colegiatura',130.00,0.00,130.00),(6,'329',1,1,3,'Colegiatura ',120.00,NULL,130.00);
/*!40000 ALTER TABLE `detalle_recibo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado` (
  `ID_ESTADO` int(11) NOT NULL AUTO_INCREMENT,
  `ESTADO` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`ID_ESTADO`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES (1,'Activo'),(2,'Inactivo');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forma_pago`
--

DROP TABLE IF EXISTS `forma_pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `forma_pago` (
  `ID_FORMA_PAGO` int(11) NOT NULL AUTO_INCREMENT,
  `FORMA_PAGO` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`ID_FORMA_PAGO`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forma_pago`
--

LOCK TABLES `forma_pago` WRITE;
/*!40000 ALTER TABLE `forma_pago` DISABLE KEYS */;
INSERT INTO `forma_pago` VALUES (1,'Efectivo'),(2,'Voucher');
/*!40000 ALTER TABLE `forma_pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genero` (
  `ID_GENERO` int(11) NOT NULL AUTO_INCREMENT,
  `GENERO` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`ID_GENERO`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

LOCK TABLES `genero` WRITE;
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` VALUES (1,'Femenino'),(2,'Masculino');
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grado`
--

DROP TABLE IF EXISTS `grado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grado` (
  `ID_GRADO` int(11) NOT NULL AUTO_INCREMENT,
  `ID_NIVEL` int(11) DEFAULT NULL,
  `GRADO` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_GRADO`),
  KEY `FK_GRADO_NIVEL` (`ID_NIVEL`),
  CONSTRAINT `FK_GRADO_NIVEL` FOREIGN KEY (`ID_NIVEL`) REFERENCES `nivel` (`ID_NIVEL`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grado`
--

LOCK TABLES `grado` WRITE;
/*!40000 ALTER TABLE `grado` DISABLE KEYS */;
INSERT INTO `grado` VALUES (1,1,'Kinder'),(2,1,'Preparatoria'),(3,2,'Primero'),(4,2,'Segundo'),(5,2,'Tercero'),(6,2,'Cuarto'),(7,2,'Quinto'),(8,2,'Sexto'),(9,3,'Primero '),(10,3,'Segundo'),(11,3,'Tercero');
/*!40000 ALTER TABLE `grado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horario`
--

DROP TABLE IF EXISTS `horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horario` (
  `ID_HORARIO` int(11) NOT NULL AUTO_INCREMENT,
  `HORARIO` varchar(25) DEFAULT NULL,
  `DESCRIPCION_HORARIO` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_HORARIO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horario`
--

LOCK TABLES `horario` WRITE;
/*!40000 ALTER TABLE `horario` DISABLE KEYS */;
/*!40000 ALTER TABLE `horario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inscripciones`
--

DROP TABLE IF EXISTS `inscripciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inscripciones` (
  `ID_INSCRIPCION` int(11) NOT NULL AUTO_INCREMENT,
  `ID_BECA` int(11) DEFAULT NULL,
  `ID_ALUMNO` int(11) DEFAULT NULL,
  `CODIGO_ALUMNO` varchar(15) DEFAULT NULL,
  `ID_GRADO` int(11) DEFAULT NULL,
  `ID_ESTADO` int(11) DEFAULT NULL,
  `COMENTARIO_INS` varchar(25) DEFAULT NULL,
  `CUOTA_INS` decimal(8,2) DEFAULT NULL,
  `CUOTA_MENSUAL` decimal(8,2) DEFAULT NULL,
  `ciclo_escolar` int(11) DEFAULT NULL,
  `FECHA_INSCRIPCION` date DEFAULT NULL,
  PRIMARY KEY (`ID_INSCRIPCION`),
  KEY `FK_ALUMNO_CICLO_ESCOLAR` (`ID_ALUMNO`,`CODIGO_ALUMNO`),
  KEY `FK_GRADO_INSCRIPCION` (`ID_GRADO`),
  KEY `FK_INSCRIPCION_BECA` (`ID_BECA`),
  KEY `FK_INSCRIPCION_ESTADO` (`ID_ESTADO`),
  CONSTRAINT `FK_ALUMNO_CICLO_ESCOLAR` FOREIGN KEY (`ID_ALUMNO`, `CODIGO_ALUMNO`) REFERENCES `alumno` (`ID_ALUMNO`, `CODIGO_ALUMNO`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_GRADO_INSCRIPCION` FOREIGN KEY (`ID_GRADO`) REFERENCES `grado` (`ID_GRADO`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_INSCRIPCION_BECA` FOREIGN KEY (`ID_BECA`) REFERENCES `becas` (`ID_BECA`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_INSCRIPCION_ESTADO` FOREIGN KEY (`ID_ESTADO`) REFERENCES `estado` (`ID_ESTADO`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inscripciones`
--

LOCK TABLES `inscripciones` WRITE;
/*!40000 ALTER TABLE `inscripciones` DISABLE KEYS */;
INSERT INTO `inscripciones` VALUES (1,1,1,'0001',1,1,NULL,120.00,130.00,2019,'2019-10-01'),(2,1,2,'0002',5,1,NULL,120.00,130.00,2019,NULL),(3,1,4,'0007',5,1,NULL,130.00,150.00,2020,'2019-10-22');
/*!40000 ALTER TABLE `inscripciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `meses_pago`
--

DROP TABLE IF EXISTS `meses_pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meses_pago` (
  `ID_MES_PAGO` int(11) NOT NULL AUTO_INCREMENT,
  `MES_PAGO` varchar(20) DEFAULT NULL,
  `ESTADO_MES` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_MES_PAGO`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meses_pago`
--

LOCK TABLES `meses_pago` WRITE;
/*!40000 ALTER TABLE `meses_pago` DISABLE KEYS */;
INSERT INTO `meses_pago` VALUES (0,'Inscripción',NULL),(1,'Enero',NULL),(2,'Febrero',NULL),(3,'Marzo',NULL),(4,'Abril',NULL),(5,'Mayo',NULL),(6,'Junio',NULL),(7,'Julio',NULL),(8,'Agosto',NULL),(9,'Septiembre',NULL),(10,'Octubre',NULL);
/*!40000 ALTER TABLE `meses_pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mora`
--

DROP TABLE IF EXISTS `mora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mora` (
  `ID_MORA` int(11) NOT NULL AUTO_INCREMENT,
  `CONCEPTO_MORA` varchar(25) DEFAULT NULL,
  `VALOR` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`ID_MORA`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mora`
--

LOCK TABLES `mora` WRITE;
/*!40000 ALTER TABLE `mora` DISABLE KEYS */;
INSERT INTO `mora` VALUES (1,'Sin Recargo',NULL),(2,'Retraso Pago',0.05);
/*!40000 ALTER TABLE `mora` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nivel`
--

DROP TABLE IF EXISTS `nivel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nivel` (
  `ID_NIVEL` int(11) NOT NULL AUTO_INCREMENT,
  `NIVEL` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_NIVEL`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nivel`
--

LOCK TABLES `nivel` WRITE;
/*!40000 ALTER TABLE `nivel` DISABLE KEYS */;
INSERT INTO `nivel` VALUES (1,'Pre-primaria'),(2,'Primaria'),(3,'Básico'),(4,'Nose'),(5,'Prueba');
/*!40000 ALTER TABLE `nivel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `pagos_alumnos`
--

DROP TABLE IF EXISTS `pagos_alumnos`;
/*!50001 DROP VIEW IF EXISTS `pagos_alumnos`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `pagos_alumnos` AS SELECT 
 1 AS `ID_ALUMNO`,
 1 AS `ID_MES_PAGO`,
 1 AS `Pagado`,
 1 AS `Saldo`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `recibo`
--

DROP TABLE IF EXISTS `recibo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recibo` (
  `no_recibo` int(11) NOT NULL,
  `ID_USUARIO` int(11) DEFAULT NULL,
  `ID_ALUMNO` int(11) DEFAULT NULL,
  `CODIGO_ALUMNO` varchar(15) DEFAULT NULL,
  `FECHA_RECIBO` datetime DEFAULT NULL,
  `TOTAL` decimal(8,2) DEFAULT NULL,
  `OBSERVACIONES` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`no_recibo`),
  KEY `FK_ALUMNO_RECIBO` (`ID_ALUMNO`,`CODIGO_ALUMNO`),
  KEY `FK_USUARIO_RECIBO` (`ID_USUARIO`),
  CONSTRAINT `FK_ALUMNO_RECIBO` FOREIGN KEY (`ID_ALUMNO`, `CODIGO_ALUMNO`) REFERENCES `alumno` (`ID_ALUMNO`, `CODIGO_ALUMNO`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_USUARIO_RECIBO` FOREIGN KEY (`ID_USUARIO`) REFERENCES `usuarios` (`ID_USUARIO`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recibo`
--

LOCK TABLES `recibo` WRITE;
/*!40000 ALTER TABLE `recibo` DISABLE KEYS */;
INSERT INTO `recibo` VALUES (323,2,1,'0001','2019-11-01 00:00:00',NULL,NULL),(327,2,1,'0001',NULL,NULL,NULL),(328,2,2,'0002',NULL,NULL,NULL),(329,2,1,'0001',NULL,NULL,NULL);
/*!40000 ALTER TABLE `recibo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_usuario`
--

DROP TABLE IF EXISTS `tipo_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_usuario` (
  `ID_TIPO_USUARIO` int(11) NOT NULL AUTO_INCREMENT,
  `TIPO_USUARIO` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_TIPO_USUARIO`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_usuario`
--

LOCK TABLES `tipo_usuario` WRITE;
/*!40000 ALTER TABLE `tipo_usuario` DISABLE KEYS */;
INSERT INTO `tipo_usuario` VALUES (1,'Dirección'),(2,'Secretaría'),(3,'Contabilidad');
/*!40000 ALTER TABLE `tipo_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `ID_USUARIO` int(11) NOT NULL AUTO_INCREMENT,
  `ID_TIPO_USUARIO` int(11) DEFAULT NULL,
  `ID_ESTADO` int(11) DEFAULT NULL,
  `ID_GENERO` int(11) DEFAULT NULL,
  `USUARIO` varchar(25) DEFAULT NULL,
  `CONTRASENA` varchar(50) DEFAULT NULL,
  `NOMBRE_USUARIO` varchar(30) DEFAULT NULL,
  `APELLIDO_USUARIO` varchar(25) DEFAULT NULL,
  `CORREO_USUARIO` varchar(50) DEFAULT NULL,
  `ULTIMA_SESION` datetime DEFAULT NULL,
  `ESTADO_USUARIO` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`ID_USUARIO`),
  KEY `FK_GENERO_USUARIO` (`ID_GENERO`),
  KEY `FK_USUARIO_ESTADO` (`ID_ESTADO`),
  KEY `FK_USUARIO_TIPO_USUARIO` (`ID_TIPO_USUARIO`),
  CONSTRAINT `FK_GENERO_USUARIO` FOREIGN KEY (`ID_GENERO`) REFERENCES `genero` (`ID_GENERO`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_USUARIO_ESTADO` FOREIGN KEY (`ID_ESTADO`) REFERENCES `estado` (`ID_ESTADO`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_USUARIO_TIPO_USUARIO` FOREIGN KEY (`ID_TIPO_USUARIO`) REFERENCES `tipo_usuario` (`ID_TIPO_USUARIO`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,1,1,1,'Direccion','d033e22ae348aeb5660fc2140aec35850c4da997',NULL,NULL,NULL,'2019-11-03 00:48:32',NULL),(2,2,1,1,'Secretaria','e0c9035898dd52fc65c41454cec9c4d2611bfb37',NULL,NULL,NULL,'2019-11-03 02:47:22',NULL);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Current Database: `sistemapagoscolegio`
--

USE `sistemapagoscolegio`;

--
-- Final view structure for view `pagos_alumnos`
--

/*!50001 DROP VIEW IF EXISTS `pagos_alumnos`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `pagos_alumnos` AS select `alumno`.`ID_ALUMNO` AS `ID_ALUMNO`,`detalle_recibo`.`ID_MES_PAGO` AS `ID_MES_PAGO`,sum(`detalle_recibo`.`IMPORTE`) AS `Pagado`,if((`detalle_recibo`.`ID_MES_PAGO` = 0),(`inscripciones`.`CUOTA_INS` - sum(`detalle_recibo`.`SUBTOTAL`)),(`inscripciones`.`CUOTA_MENSUAL` - sum(`detalle_recibo`.`SUBTOTAL`))) AS `Saldo` from (((`recibo` join `detalle_recibo` on((`recibo`.`no_recibo` = `detalle_recibo`.`no_recibo`))) join `inscripciones` on((`recibo`.`ID_ALUMNO` = `inscripciones`.`ID_ALUMNO`))) join `alumno` on((`inscripciones`.`ID_ALUMNO` = `alumno`.`ID_ALUMNO`))) group by `recibo`.`ID_ALUMNO`,`detalle_recibo`.`ID_MES_PAGO` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-03  2:47:28
