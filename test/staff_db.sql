-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 25, 2020 at 12:42 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `staff_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `staff_info`
--

CREATE TABLE `staff_info` (
  `staff_id` int(11) NOT NULL,
  `staff_fname` varchar(50) NOT NULL,
  `staff_lname` varchar(50) NOT NULL,
  `staff_address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff_info`
--

INSERT INTO `staff_info` (`staff_id`, `staff_fname`, `staff_lname`, `staff_address`) VALUES
(1, 'Jerome', 'yawson', 'jhsjhskkfjs'),
(3, 'PKy', 'jhsdj', 'amalitech'),
(5, 'papa', 'yaw', 'new site');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `staff_info`
--
ALTER TABLE `staff_info`
  ADD PRIMARY KEY (`staff_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `staff_info`
--
ALTER TABLE `staff_info`
  MODIFY `staff_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
