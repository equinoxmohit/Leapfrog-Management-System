-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 22, 2016 at 04:59 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lms_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_courses`
--

CREATE TABLE `tbl_courses` (
  `course_id` int(11) NOT NULL,
  `course_name` varchar(200) NOT NULL,
  `course_description` text NOT NULL,
  `fees` int(11) NOT NULL,
  `duration` int(11) NOT NULL,
  `duration_type` varchar(50) NOT NULL,
  `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_courses`
--

INSERT INTO `tbl_courses` (`course_id`, `course_name`, `course_description`, `fees`, `duration`, `duration_type`, `added_date`, `modified_date`, `status`) VALUES
(1, 'Core Java', 'Java course for beginners who have little or no knowledge on any programming language or java itself.', 12000, 6, 'Weeks', '2016-09-22 06:10:47', NULL, 1),
(2, 'Advanced Java', 'Java course for people with knowledge on Java programming language.', 20000, 8, 'Weeks', '2016-09-22 07:09:26', NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_employment_status`
--

CREATE TABLE `tbl_employment_status` (
  `employment_status_id` int(11) NOT NULL,
  `employment_status_name` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_employment_status`
--

INSERT INTO `tbl_employment_status` (`employment_status_id`, `employment_status_name`) VALUES
(1, 'Employed'),
(2, 'Unemployed but not looking for job'),
(3, 'Unemployed but  looking for job'),
(4, 'Self-Employed(Freelancer)'),
(5, 'Entrepreneur building/growing a business'),
(6, 'Student');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_enquiry_status`
--

CREATE TABLE `tbl_enquiry_status` (
  `enquiry_status_id` int(11) NOT NULL,
  `enquiry_status_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_enquiry_status`
--

INSERT INTO `tbl_enquiry_status` (`enquiry_status_id`, `enquiry_status_name`) VALUES
(1, 'Friends/Family'),
(2, 'Employer/Colleague'),
(3, 'Google or Other Search Engine'),
(4, 'Facebook/Twitter/Social Media'),
(5, 'Email/ Newsletter marketting'),
(6, 'Another Website/ Blog'),
(7, 'News Article'),
(8, 'Conference/Event/Meetup'),
(9, 'Financial Partner'),
(10, 'LFA Student/ Alumni'),
(11, 'Others');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_enrollment`
--

CREATE TABLE `tbl_enrollment` (
  `enrollment_id` int(11) NOT NULL,
  `first_name` varchar(150) NOT NULL,
  `last_name` varchar(150) NOT NULL,
  `email_id` varchar(150) NOT NULL,
  `contact_number` varchar(20) NOT NULL,
  `college_name` varchar(200) NOT NULL,
  `enrollment_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `faculty_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `employment_status_id` int(11) NOT NULL,
  `enquiry_status_id` int(11) NOT NULL,
  `enrollment_status` tinyint(4) NOT NULL DEFAULT '0',
  `is_read` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_faculties`
--

CREATE TABLE `tbl_faculties` (
  `faculty_id` int(11) NOT NULL,
  `faculty_name` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_faculties`
--

INSERT INTO `tbl_faculties` (`faculty_id`, `faculty_name`) VALUES
(1, '+2(Science)'),
(2, '+2(Management)'),
(3, '+2(Humanities)'),
(4, 'A-Levels'),
(5, 'BBA'),
(6, 'BIM'),
(7, 'Bachelors in Electrical Enginnering'),
(8, 'BscCsit'),
(9, 'BCIS'),
(10, 'BCA'),
(11, 'BIT'),
(12, 'Other/Non IT'),
(13, 'Bachelors in Computer Engineering');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_courses`
--
ALTER TABLE `tbl_courses`
  ADD PRIMARY KEY (`course_id`);

--
-- Indexes for table `tbl_employment_status`
--
ALTER TABLE `tbl_employment_status`
  ADD PRIMARY KEY (`employment_status_id`);

--
-- Indexes for table `tbl_enquiry_status`
--
ALTER TABLE `tbl_enquiry_status`
  ADD PRIMARY KEY (`enquiry_status_id`);

--
-- Indexes for table `tbl_enrollment`
--
ALTER TABLE `tbl_enrollment`
  ADD PRIMARY KEY (`enrollment_id`);

--
-- Indexes for table `tbl_faculties`
--
ALTER TABLE `tbl_faculties`
  ADD PRIMARY KEY (`faculty_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_courses`
--
ALTER TABLE `tbl_courses`
  MODIFY `course_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tbl_employment_status`
--
ALTER TABLE `tbl_employment_status`
  MODIFY `employment_status_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `tbl_enquiry_status`
--
ALTER TABLE `tbl_enquiry_status`
  MODIFY `enquiry_status_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `tbl_enrollment`
--
ALTER TABLE `tbl_enrollment`
  MODIFY `enrollment_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_faculties`
--
ALTER TABLE `tbl_faculties`
  MODIFY `faculty_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
