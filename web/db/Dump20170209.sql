-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: 127.0.0.1    Database: mydb
-- ------------------------------------------------------
-- Server version	5.6.35

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
-- Table structure for table `Categories`
--

DROP TABLE IF EXISTS `Categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Categories` (
  `CategoryName` varchar(45) NOT NULL,
  `CategoryDescription` varchar(512) DEFAULT NULL,
  `Picture` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`CategoryName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Categories`
--

LOCK TABLES `Categories` WRITE;
/*!40000 ALTER TABLE `Categories` DISABLE KEYS */;
INSERT INTO `Categories` VALUES ('Computers & Tablets',NULL,NULL),('SMARTPHONE',NULL,NULL),('Watches',NULL,NULL);
/*!40000 ALTER TABLE `Categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CreditCardType`
--

DROP TABLE IF EXISTS `CreditCardType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CreditCardType` (
  `CreditCardTypeID` int(11) NOT NULL AUTO_INCREMENT,
  `Type` varchar(25) NOT NULL,
  PRIMARY KEY (`CreditCardTypeID`),
  UNIQUE KEY `CreditCardTypeID_UNIQUE` (`CreditCardTypeID`),
  UNIQUE KEY `Type_UNIQUE` (`Type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CreditCardType`
--

LOCK TABLES `CreditCardType` WRITE;
/*!40000 ALTER TABLE `CreditCardType` DISABLE KEYS */;
/*!40000 ALTER TABLE `CreditCardType` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CreditCards`
--

DROP TABLE IF EXISTS `CreditCards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CreditCards` (
  `CreditCardNumber` varchar(45) NOT NULL,
  `CreditCardType` int(11) NOT NULL,
  `CardHolder` varchar(45) NOT NULL,
  `CardExpMo` int(11) NOT NULL,
  `CardExpYr` int(11) NOT NULL,
  `User` varchar(45) NOT NULL,
  PRIMARY KEY (`CreditCardNumber`),
  UNIQUE KEY `CreditCardNumber_UNIQUE` (`CreditCardNumber`),
  KEY `CreditCardType_idx` (`CreditCardType`),
  KEY `User_idx` (`User`),
  CONSTRAINT `CreditCardType` FOREIGN KEY (`CreditCardType`) REFERENCES `CreditCardType` (`CreditCardTypeID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `User` FOREIGN KEY (`User`) REFERENCES `Users` (`Mail`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CreditCards`
--

LOCK TABLES `CreditCards` WRITE;
/*!40000 ALTER TABLE `CreditCards` DISABLE KEYS */;
/*!40000 ALTER TABLE `CreditCards` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Orders`
--

DROP TABLE IF EXISTS `Orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Orders` (
  `OrderID` int(11) NOT NULL AUTO_INCREMENT,
  `Consumer` varchar(45) NOT NULL,
  `OrderDate` datetime DEFAULT NULL,
  `Paid` int(11) NOT NULL,
  `Status` varchar(15) DEFAULT NULL,
  `ShipmentID` int(11) NOT NULL,
  `PaymentID` int(11) NOT NULL,
  `PaymentDate` datetime DEFAULT NULL,
  `ProductID` int(11) DEFAULT NULL,
  PRIMARY KEY (`OrderID`),
  KEY `ShipmentID_idx` (`ShipmentID`),
  KEY `PaymentID_idx` (`PaymentID`),
  KEY `ProductID_idx` (`ProductID`),
  KEY `Consumer_idx` (`Consumer`),
  CONSTRAINT `Consumer` FOREIGN KEY (`Consumer`) REFERENCES `Users` (`Mail`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `PaymentID` FOREIGN KEY (`PaymentID`) REFERENCES `PaymentTypes` (`PaymentTypeID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `ProductID` FOREIGN KEY (`ProductID`) REFERENCES `Products` (`ProductID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `ShipmentID` FOREIGN KEY (`ShipmentID`) REFERENCES `Shipments` (`ShipmentID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Orders`
--

LOCK TABLES `Orders` WRITE;
/*!40000 ALTER TABLE `Orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `Orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PaymentTypes`
--

DROP TABLE IF EXISTS `PaymentTypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PaymentTypes` (
  `PaymentTypeID` int(11) NOT NULL AUTO_INCREMENT,
  `Type` varchar(45) NOT NULL,
  PRIMARY KEY (`PaymentTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PaymentTypes`
--

LOCK TABLES `PaymentTypes` WRITE;
/*!40000 ALTER TABLE `PaymentTypes` DISABLE KEYS */;
/*!40000 ALTER TABLE `PaymentTypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Products`
--

DROP TABLE IF EXISTS `Products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Products` (
  `ProductID` int(11) NOT NULL AUTO_INCREMENT,
  `ProducerEmail` varchar(45) NOT NULL,
  `Category` varchar(45) NOT NULL,
  `SKU` varchar(45) DEFAULT NULL,
  `ProductName` varchar(45) NOT NULL,
  `ProductDescription` varchar(4096) DEFAULT NULL,
  `Picture` varchar(512) DEFAULT NULL,
  `Price` decimal(6,2) DEFAULT NULL,
  `Manufacturer` varchar(45) DEFAULT NULL,
  `isCharitable` int(11) NOT NULL DEFAULT '0',
  `Keywords` varchar(512) DEFAULT NULL,
  `DiscountPercentage` int(11) DEFAULT NULL,
  `ShipmentCost` decimal(6,2) NOT NULL,
  `Availability` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ProductID`),
  KEY `Category_idx` (`Category`),
  KEY `ProducerEmail_idx` (`ProducerEmail`),
  CONSTRAINT `Category` FOREIGN KEY (`Category`) REFERENCES `Categories` (`CategoryName`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `ProducerEmail` FOREIGN KEY (`ProducerEmail`) REFERENCES `Users` (`Mail`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Products`
--

LOCK TABLES `Products` WRITE;
/*!40000 ALTER TABLE `Products` DISABLE KEYS */;
INSERT INTO `Products` VALUES (1,'afjcjsbx@gmail.com','SMARTPHONE',NULL,'iPhone 6S','Iphone 6S Plus 64GB Space Grey: spesso le innovazioni non si notano a prima vista, ma se guardi più attentamente iPhone 6s plus ti accorgerai che è stato rivoluzionato dalle fondamenta. Iphone 6s plus è stato realizzato con lo stesso materiale impiegato nell’industria aerospaziale, un alluminio ottenuto da una combinazione esclusiva di elementi che lo rendono la lega più robusta mai utilizzata per un iPhone. ','https://www.triveo.it/7975-thickbox_default/apple-iphone-6s-plus-64gb-space-grey.jpg',699.99,'Apple',0,'Apple, iPhone, Smartphone',19,9.99,1),(2,'afjcjsbx@gmail.com','Watches',NULL,'Bulova Women\'s 98R224 Diamond Moon Phase Quar','From the Bulova Diamonds Collection. In stainless steel with gold-tone finish, with 34 diamonds individually hand set on case and white mother-of-pearl dial with moon phase indicator, flat mineral glass, and double-press deployant closure. Case size: 31.5 mm. Water resistant to 30 meters / 99 feet.\nBrand	Bulova\nModel number	98R224 \nItem Shape	Round\nDial window material type	Mineral\nDisplay Type	Analog\nClasp	Double-press deployant closure\nCase material	Stainless steel\nCase diameter	31.5 millimeters\nCase Thickness	8 millimeters\nBand Material	Stainless steel\nBand length	Women\'s standard\nBand Color	Yelolw Gold\nDial color	Yellow Gold\nCalendar	Day and date display\nMovement	Quartz (battery)\nWater resistant depth	30 meters / 99 feet\nThis Bulova model is brand new and fully functional. Each Bulova watch comes with a Bulova box, manual, valid 3-year manufacturer warranty from Bulova and tags. We are an authorized Bulova dealer. ','http://i.ebayimg.com/images/g/xq0AAOSw-0xYcC3s/s-l1600.jpg',102.99,'Bulova',0,'Watch',0,15.49,1),(3,'afjcjsbx@gmail.com','Computers & Tablets',NULL,'Dell Inspiron 15 5568 15.6\" Full HD 2-In-1 To','SPECIFICATIONS\nProcessor	6th Generation Intel Core i7-6500U Processor (4M Cache)\nOperating System	Windows 10 Home 64-Bit\nScreen Size	15.6\"\nProcessor Base Frequency	2.5GHz\nTurbo Frequency	Up to 3.1GHz\nMemory	8GB Dual Channel DDR4 2133MHz (4GBx2)\nVideo Graphics	Intel HD graphics 520\nCore Name	Skylake\nNumber of Cores	Dual-core Processor\nCPU L3 Cache	4MB\nTouchscreen	Yes\nWide Screen Support	Yes\nDisplay Type	Full HD\nResolution	1920 x 1080\nLCD Features	Truelife LED-Backlit Touch Display with Wide Viewing Angles\nGPU/VPU	Intel HD Graphics 520\nVideo Memory	Shared system memory\nGraphic Type	Integrated Card\nStorage Drive	1TB HDD\nOptical Drive	No\nHDD RPM	5400 RPM\nMemory Speed	DDR4 2133\nMemory Spec	2x 4 GB\nWLAN	802.11ac Wireless LAN\nBluetooth	Bluetooth 4.0\nAudio	MaxxAudio\nBacklit Keyboard	Backlit\nWebcam	Integrated Widescreen HD 720P Webcam with Dual Digital Microphone Array\nCard Reader	3-in-1 Card Reader (SD, SDHC, SDXC)\nAC Adapter	45-watt AC adapter\nBattery	42 WHr, 3-Cell Battery (integrated)\nDimensions (H x W x D)	0.80 x 15.04 x 9.96\" (20.2 x 381.9 x 253.1mm\nWeight	5.07 lbs (2.3kg','http://i.ebayimg.com/images/g/1SYAAOSw-0xYk6t4/s-l500.jpg',599.99,'Dell',0,'Laptop',5,5.99,1);
/*!40000 ALTER TABLE `Products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Rents`
--

DROP TABLE IF EXISTS `Rents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Rents` (
  `RentID` int(11) NOT NULL AUTO_INCREMENT,
  `Order` int(11) DEFAULT NULL,
  `DateOut` datetime DEFAULT NULL,
  `DateReturned` datetime DEFAULT NULL,
  PRIMARY KEY (`RentID`),
  KEY `Order_idx` (`Order`),
  CONSTRAINT `Order` FOREIGN KEY (`Order`) REFERENCES `Orders` (`OrderID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Rents`
--

LOCK TABLES `Rents` WRITE;
/*!40000 ALTER TABLE `Rents` DISABLE KEYS */;
/*!40000 ALTER TABLE `Rents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Reviews`
--

DROP TABLE IF EXISTS `Reviews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Reviews` (
  `ReviewsID` int(11) NOT NULL,
  `Comment` varchar(512) DEFAULT NULL,
  `Star` int(11) DEFAULT NULL,
  `ReviewProduct` int(11) DEFAULT NULL,
  `ReviewUser` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ReviewsID`),
  KEY `ReviewProduct_idx` (`ReviewProduct`),
  KEY `ReviewUser_idx` (`ReviewUser`),
  CONSTRAINT `ReviewProduct` FOREIGN KEY (`ReviewProduct`) REFERENCES `Products` (`ProductID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `ReviewUser` FOREIGN KEY (`ReviewUser`) REFERENCES `Users` (`Mail`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Reviews`
--

LOCK TABLES `Reviews` WRITE;
/*!40000 ALTER TABLE `Reviews` DISABLE KEYS */;
/*!40000 ALTER TABLE `Reviews` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Shipments`
--

DROP TABLE IF EXISTS `Shipments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Shipments` (
  `ShipmentID` int(11) NOT NULL AUTO_INCREMENT,
  `ShipmentTrack` varchar(20) DEFAULT NULL,
  `ShipmentStatus` varchar(15) DEFAULT NULL,
  `ShippingDate` datetime DEFAULT NULL,
  `Shipper` int(11) DEFAULT NULL,
  PRIMARY KEY (`ShipmentID`),
  KEY `Shippers_idx` (`Shipper`),
  CONSTRAINT `Shippers` FOREIGN KEY (`Shipper`) REFERENCES `Shippers` (`ShipperID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Shipments`
--

LOCK TABLES `Shipments` WRITE;
/*!40000 ALTER TABLE `Shipments` DISABLE KEYS */;
/*!40000 ALTER TABLE `Shipments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Shippers`
--

DROP TABLE IF EXISTS `Shippers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Shippers` (
  `ShipperID` int(11) NOT NULL AUTO_INCREMENT,
  `ShipperName` varchar(20) NOT NULL,
  `ShipperPhone` varchar(13) DEFAULT NULL,
  `ShipperWebsite` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ShipperID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Shippers`
--

LOCK TABLES `Shippers` WRITE;
/*!40000 ALTER TABLE `Shippers` DISABLE KEYS */;
/*!40000 ALTER TABLE `Shippers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Users`
--

DROP TABLE IF EXISTS `Users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Users` (
  `Mail` varchar(45) NOT NULL,
  `Username` varchar(15) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Surname` varchar(20) NOT NULL,
  `Address1` varchar(45) DEFAULT NULL,
  `Address2` varchar(45) DEFAULT NULL,
  `City` varchar(20) DEFAULT NULL,
  `State` varchar(20) DEFAULT NULL,
  `PostalCode` varchar(6) DEFAULT NULL,
  `Country` varchar(20) DEFAULT NULL,
  `Phone` varchar(13) DEFAULT NULL,
  `Website` varchar(45) DEFAULT NULL,
  `PayPalAccount` varchar(30) DEFAULT NULL,
  `Type` varchar(1) NOT NULL,
  PRIMARY KEY (`Mail`),
  UNIQUE KEY `Username_UNIQUE` (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Users`
--

LOCK TABLES `Users` WRITE;
/*!40000 ALTER TABLE `Users` DISABLE KEYS */;
INSERT INTO `Users` VALUES ('afjcjsbx@gmail.com','afjcjsbx','qwerty','Mauro','Trulli','Via S. Francesca 135A',NULL,'Veroli','Frosinone','03029','Italy',NULL,NULL,NULL,'P');
/*!40000 ALTER TABLE `Users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-09 15:43:00
