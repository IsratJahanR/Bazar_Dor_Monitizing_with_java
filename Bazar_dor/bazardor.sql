-- create a database named bazardor first
-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 05, 2023 at 01:41 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bazardor`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `name` varchar(50) NOT NULL DEFAULT 'Mr. X',
  `email` varchar(50) NOT NULL,
  `password` varchar(15) NOT NULL,
  `age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`name`, `email`, `password`, `age`) VALUES
('1234', '1234', '1234', 1234),
('admin', 'admin@email.com', 'root', 18),
('rakib', 'rakib', '12345', 21),
('Rakibul islam', 'rakib151p@gmail.com', '123', 18),
('Md. Rakibul Islam', 'rakib151q@gmail.com', '1234', 21),
('rakib', 'rashed', '1234', 123);

-- --------------------------------------------------------

--
-- Table structure for table `productdetails`
--

CREATE TABLE `productdetails` (
  `product_ID` int(11) NOT NULL,
  `product_Name` varchar(50) NOT NULL,
  `Current_Price` int(11) NOT NULL,
  `Product_Type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `productdetails`
--

INSERT INTO `productdetails` (`product_ID`, `product_Name`, `Current_Price`, `Product_Type`) VALUES
(123, 'Orange', 145, 'Fruits'),
(1001, 'manga', 1234, 'Fruits'),
(1002, '123', 198, 'Bakery'),
(1231, 'dfkbhjkdh', 1234, 'Fish and Seafood'),
(1234, 'banana', 188, 'Dairy');

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `username` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `product_ID` int(11) NOT NULL,
  `comments` varchar(150) NOT NULL,
  `Reporting date` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `report`
--

INSERT INTO `report` (`username`, `email`, `product_ID`, `comments`, `Reporting date`) VALUES
('12', '12', 12, '12', '2023-07-01'),
('12', '12', 12, '12', '2023-07-01'),
('13', '14', 15, '17', '2023-07-01'),
('13', '14', 15, '17', '2023-07-01'),
('rakib', 'rakib', 123, 'my name ias rakivbul islam', '2023-07-01'),
('rakib', 'rakib', 123, 'this is m,er ', '2023-07-01'),
('Md. Rakibul Islam', 'rakib151q@gmail.com', 1005, 'h9i', '2023-07-01'),
('Md. Rakibul Islam', 'rakib151q@gmail.com', 1005, 'h9i', '2023-07-01'),
('rakib', 'rakib', 1234, 'hi', '2023-07-01');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `productdetails`
--
ALTER TABLE `productdetails`
  ADD PRIMARY KEY (`product_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
