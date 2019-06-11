-- phpMyAdmin SQL Dump 
-- version 4.4.14
-- http://www.phpmyadmin.net
-- 
-- Host: 127.0.0.1
-- Generation Time: Mar 13, 2016 at 11:02 AM
-- Server version: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `swim`
--

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `c_id` int(11) NOT NULL,
  `id_course` int(10) NOT NULL,
  `name_course` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `age_limit` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `hour_course` varchar(3) COLLATE utf8_unicode_ci NOT NULL,
  `hour_of_course` int(3) NOT NULL,
  `date_time` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `name_trainer` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pay`
--

CREATE TABLE IF NOT EXISTS `pay` (
  `p_id` int(11) NOT NULL,
  `p_name` varchar(30) NOT NULL,
  `p_codeuser` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `p_datetime` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `p_money` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `registerstudy`
--

CREATE TABLE IF NOT EXISTS `registerstudy` (
  `r_name_user` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `r_name_trainer` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `r_codeid` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `r_tel` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `r_birthday` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `r_type` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `r_coures` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE IF NOT EXISTS `staff` (
  `st_id` int(11) NOT NULL,
  `st_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `st_telephone` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `st_login` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `st_pass` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`st_id`, `st_name`, `st_telephone`, `st_login`, `st_pass`, `status`) VALUES
(1, 'Tinnakorn', '78787878', 'admin', 'admin', '2'),
(2, 'Tinnakorn', '0903333434', 'boss', 'boss', '3'),
(3, 'Tinnakorn', '098474844', 'teacher', 'teacher', '4');

-- --------------------------------------------------------

--
-- Table structure for table `study`
--

CREATE TABLE IF NOT EXISTS `study` (
  `s_id` int(11) NOT NULL,
  `time_start` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `time_end` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `name_trainer` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `u_id` varchar(13) COLLATE utf8_unicode_ci NOT NULL,
  `u_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `u_type` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `u_birthday` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `status` varchar(10) COLLATE utf8_unicode_ci NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`c_id`);

--
-- Indexes for table `pay`
--
ALTER TABLE `pay`
  ADD PRIMARY KEY (`p_id`);

--
-- Indexes for table `registerstudy`
--
ALTER TABLE `registerstudy`
  ADD PRIMARY KEY (`r_codeid`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`st_id`);

--
-- Indexes for table `study`
--
ALTER TABLE `study`
  ADD PRIMARY KEY (`s_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `c_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `pay`
--
ALTER TABLE `pay`
  MODIFY `p_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `st_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `study`
--
ALTER TABLE `study`
  MODIFY `s_id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
