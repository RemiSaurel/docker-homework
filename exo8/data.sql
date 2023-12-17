-- phpMyAdmin SQL Dump
-- version 4.2.10
-- http://www.phpmyadmin.net
--
-- Client :  localhost:3306
-- Généré le :  Ven 03 Mars 2017 à 09:41
-- Version du serveur :  5.5.38
-- Version de PHP :  5.6.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `test`;

-- --------------------------------------------------------

--
-- Structure de la table `personnes`
--

CREATE TABLE `personnes` (
`id` bigint(20) NOT NULL,
  `age` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `personnes`
--

INSERT INTO `personnes` (`id`, `age`, `email`, `firstname`, `lastname`) VALUES
(1, 29, 'remi.venant@irit.fr', 'Rémi', 'Venant'),
(2, 39, 'cedric@teyssie.com', 'Cédric', 'Teyssié'),
(3, 40, 'patrice.torguet@comodore64.com', 'Patrice', 'Torguet'),
(4, 55, 'daniel.marquie@miage.com', 'Daniel', 'Marquié'),
(5, 69, 'le.miagiste@miage.fr', 'Le', 'Miagiste'),
(6, 50, '00:0a:27:02:00:5e:1b:04', 'Francois', 'Barrere'),
(7, 50, '141.115.64.50', 'Thierry', 'Desprats');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `personnes`
--
ALTER TABLE `personnes`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `personnes`
--
ALTER TABLE `personnes`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
