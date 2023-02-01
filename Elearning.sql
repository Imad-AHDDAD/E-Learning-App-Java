-- phpMyAdmin SQL Dump
-- version 5.1.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 31, 2023 at 11:56 PM
-- Server version: 5.7.24
-- PHP Version: 8.1.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `chatapp`
--
CREATE DATABASE IF NOT EXISTS `chatapp` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `chatapp`;

-- --------------------------------------------------------

--
-- Table structure for table `friendship`
--

CREATE TABLE `friendship` (
  `id` int(11) NOT NULL,
  `username1` varchar(250) NOT NULL,
  `username2` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `friendship`
--

INSERT INTO `friendship` (`id`, `username1`, `username2`) VALUES
(1, 'imadahddad2', 'imadahddad');

-- --------------------------------------------------------

--
-- Table structure for table `invitation`
--

CREATE TABLE `invitation` (
  `id` int(11) NOT NULL,
  `invSender` varchar(250) NOT NULL,
  `invReciever` varchar(250) NOT NULL,
  `accepted` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `invitation`
--

INSERT INTO `invitation` (`id`, `invSender`, `invReciever`, `accepted`) VALUES
(5, 'imadahddad', 'imadahddad2', 'yes');

-- --------------------------------------------------------

--
-- Table structure for table `msg`
--

CREATE TABLE `msg` (
  `id` int(11) NOT NULL,
  `sender` varchar(250) NOT NULL,
  `reciever` varchar(250) NOT NULL,
  `content` varchar(2000) NOT NULL,
  `dateSent` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `msg`
--

INSERT INTO `msg` (`id`, `sender`, `reciever`, `content`, `dateSent`) VALUES
(89, 'imadahddad4', 'imadahddad', 'Hi imad !', 'Wed Jan 04 15:44:43 CET 2023'),
(90, 'imadahddad4', 'imadahddad', 'How are you ?', 'Wed Jan 04 15:45:12 CET 2023'),
(91, 'imadahddad', 'imadahddad4', 'Fine thanks', 'Wed Jan 04 15:45:26 CET 2023'),
(92, 'imadahddad', 'imadahddad4', 'you ?', 'Wed Jan 04 15:45:31 CET 2023'),
(93, 'imadahddad', 'imadahddad2', 'Hi', 'Fri Jan 06 15:25:02 CET 2023'),
(94, 'imadahddad2', 'imadahddad', 'hello', 'Fri Jan 06 15:25:12 CET 2023'),
(95, 'imadahddad2', 'imadahddad', 'how are you ?', 'Fri Jan 06 15:25:27 CET 2023'),
(96, 'imadahddad', 'imadahddad2', 'fine thanks', 'Fri Jan 06 15:31:06 CET 2023');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(250) NOT NULL,
  `password` varchar(250) NOT NULL,
  `ipAddress` varchar(250) DEFAULT NULL,
  `port` int(11) DEFAULT NULL,
  `status` varchar(250) DEFAULT 'OFFLINE'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `ipAddress`, `port`, `status`) VALUES
(4, 'imadahddad', '4467d6f9af6a8fe833ad9081f87bbf5c', '192.168.26.72', 62802, 'OFFLINE'),
(6, 'imadahddad2', 'e726d485991be3a0405fbfda9c67e287', '192.168.26.72', 54325, 'OFFLINE'),
(9, 'imadahddad3', 'c0dfff6fe207f49d1a5c480b47e8d5bf', NULL, NULL, 'OFFLINE'),
(10, 'imadahddad4', '6bd64d9d1be34c920e1b5fe789317c6f', '192.168.137.1', 57567, 'OFFLINE'),
(11, 'imadahddad5', '63add9698651d43d49c3bd685eac583e', NULL, NULL, 'OFFLINE'),
(12, 'imadahddad6', '9934b355d3afd24a4e9ea2ac79557ffb', NULL, NULL, 'OFFLINE');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `friendship`
--
ALTER TABLE `friendship`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `invitation`
--
ALTER TABLE `invitation`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `msg`
--
ALTER TABLE `msg`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `friendship`
--
ALTER TABLE `friendship`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `invitation`
--
ALTER TABLE `invitation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `msg`
--
ALTER TABLE `msg`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=97;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- Database: `elearning`
--
CREATE DATABASE IF NOT EXISTS `elearning` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `elearning`;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `libelle` varchar(500) DEFAULT NULL,
  `teacher` varchar(250) DEFAULT NULL,
  `affected` varchar(3) DEFAULT 'no',
  `level` varchar(10) DEFAULT NULL,
  `status` varchar(5) DEFAULT 'OFF',
  `address` varchar(250) DEFAULT NULL,
  `port` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`libelle`, `teacher`, `affected`, `level`, `status`, `address`, `port`) VALUES
('Java', 'charrabrahim', 'yes', 'IRISI 1', 'OFF', NULL, NULL),
('Reseaux', 'charraahmed', 'yes', 'IRISI 2', 'ON', '192.168.26.72', '50535'),
('UML', 'mouhmaneyassine', 'yes', 'IRISI 3', 'OFF', NULL, NULL),
('DATABASE', 'amgaroulahcen', 'yes', 'IRISI 1', 'OFF', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `document`
--

CREATE TABLE `document` (
  `libelle` varchar(250) DEFAULT NULL,
  `date` varchar(250) DEFAULT NULL,
  `path` varchar(250) DEFAULT NULL,
  `coursename` varchar(250) DEFAULT NULL,
  `level` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `document`
--

INSERT INTO `document` (`libelle`, `date`, `path`, `coursename`, `level`) VALUES
('java-logo-1.png', 'Mon Jan 30 04:01:29 CET 2023', 'C:\\Users\\AHDDAD\\Desktop\\java-logo-1.png', 'Reseaux', 'IRISI 2');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `username` varchar(250) NOT NULL,
  `level` varchar(250) DEFAULT NULL,
  `connected` varchar(10) DEFAULT 'no'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`username`, `level`, `connected`) VALUES
('AHDDAD1', 'IRISI 2', 'no'),
('AHDDAD2', 'IRISI 2', 'no'),
('AHDDAD3', 'IRISI 1', 'no'),
('AHDDAD4', 'IRISI 1', 'no'),
('AHDDAD5', 'IRISI 1', 'no'),
('AHDDAD6', 'IRISI 2', 'no');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `username` varchar(250) DEFAULT NULL,
  `courses` varchar(10) DEFAULT NULL,
  `hasCourse` varchar(3) DEFAULT 'no'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`username`, `courses`, `hasCourse`) VALUES
('charraahmed', '1', 'yes'),
('charrabrahim', '1', 'yes'),
('mouhmaneyassine', '1', 'yes'),
('amgaroulahcen', '1', 'yes');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `type` varchar(250) DEFAULT NULL,
  `username` varchar(250) DEFAULT NULL,
  `pass` varchar(250) DEFAULT NULL,
  `firstname` varchar(250) DEFAULT NULL,
  `lastname` varchar(250) DEFAULT NULL,
  `address` varchar(250) DEFAULT NULL,
  `port` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`type`, `username`, `pass`, `firstname`, `lastname`, `address`, `port`) VALUES
('admin', 'imadahddad', 'imadahddad', 'imad', 'ahddad', NULL, NULL),
('student', 'AHDDAD1', 'AHDDAD1', 'imad', 'AHDDAD', '192.168.26.72', '50537'),
('student', 'AHDDAD2', 'AHDDAD2', 'mohamed', 'ahddad', '192.168.137.1', '51742'),
('teacher', 'charrabrahim', 'charrabrahim', 'brahim', 'charra', NULL, NULL),
('teacher', 'charraahmed', 'charraahmed', 'ahmed', 'charra', NULL, NULL),
('student', 'AHDDAD3', 'AHDDAD3', 'brahim', 'ahddad', NULL, NULL),
('student', 'AHDDAD4', 'AHDDAD4', 'abdellah', 'ahddad', NULL, NULL),
('student', 'AHDDAD5', 'AHDDAD5', 'lahcen', 'AHDDAD', NULL, NULL),
('student', 'AHDDAD6', 'AHDDAD6', 'walid', 'ELAATIQI', NULL, NULL),
('teacher', 'mouhmaneyassine', 'mouhmaneyassine', 'yassine', 'mouhmane', NULL, NULL),
('teacher', 'amgaroulahcen', 'amgaroulahcen', 'lahcen', 'amgarou', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`username`);
--
-- Database: `laravel_tuto_db`
--
CREATE DATABASE IF NOT EXISTS `laravel_tuto_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `laravel_tuto_db`;

-- --------------------------------------------------------

--
-- Table structure for table `computers`
--

CREATE TABLE `computers` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `origin` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `price` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `computers`
--

INSERT INTO `computers` (`id`, `name`, `origin`, `price`, `created_at`, `updated_at`) VALUES
(1, 'DELL', 'MORCCO', 700, '2022-12-12 20:45:59', '2022-12-12 20:45:59'),
(3, 'HP', 'Inzegane', 500, '2022-12-12 21:01:19', '2022-12-12 21:01:19'),
(4, 'Lenovo', 'Agadir', 5900, '2022-12-12 21:46:30', '2022-12-12 22:12:48');

-- --------------------------------------------------------

--
-- Table structure for table `failed_jobs`
--

CREATE TABLE `failed_jobs` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `uuid` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `connection` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `queue` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `payload` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `exception` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `failed_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `migrations`
--

CREATE TABLE `migrations` (
  `id` int(10) UNSIGNED NOT NULL,
  `migration` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `migrations`
--

INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
(1, '2014_10_12_000000_create_users_table', 1),
(2, '2014_10_12_100000_create_password_resets_table', 1),
(3, '2019_08_19_000000_create_failed_jobs_table', 1),
(4, '2019_12_14_000001_create_personal_access_tokens_table', 1),
(5, '2022_12_12_160657_create_computers_table', 1);

-- --------------------------------------------------------

--
-- Table structure for table `password_resets`
--

CREATE TABLE `password_resets` (
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `personal_access_tokens`
--

CREATE TABLE `personal_access_tokens` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `tokenable_type` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tokenable_id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL,
  `abilities` text COLLATE utf8mb4_unicode_ci,
  `last_used_at` timestamp NULL DEFAULT NULL,
  `expires_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email_verified_at` timestamp NULL DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `remember_token` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `computers`
--
ALTER TABLE `computers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `failed_jobs`
--
ALTER TABLE `failed_jobs`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `failed_jobs_uuid_unique` (`uuid`);

--
-- Indexes for table `migrations`
--
ALTER TABLE `migrations`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `password_resets`
--
ALTER TABLE `password_resets`
  ADD KEY `password_resets_email_index` (`email`);

--
-- Indexes for table `personal_access_tokens`
--
ALTER TABLE `personal_access_tokens`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `personal_access_tokens_token_unique` (`token`),
  ADD KEY `personal_access_tokens_tokenable_type_tokenable_id_index` (`tokenable_type`,`tokenable_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `users_email_unique` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `computers`
--
ALTER TABLE `computers`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `failed_jobs`
--
ALTER TABLE `failed_jobs`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `personal_access_tokens`
--
ALTER TABLE `personal_access_tokens`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
