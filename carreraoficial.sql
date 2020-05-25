-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3307
-- Tiempo de generación: 25-05-2020 a las 12:12:17
-- Versión del servidor: 8.0.18
-- Versión de PHP: 7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `carreraoficial`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abonado`
--

CREATE TABLE `abonado` (
  `ID_ABONADO` int(3) UNSIGNED ZEROFILL NOT NULL,
  `NOMBRE` varchar(21) COLLATE utf8mb4_unicode_ci NOT NULL,
  `APELLIDO1` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `APELLIDO2` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CODZONA` int(3) UNSIGNED ZEROFILL NOT NULL,
  `DIRECCION` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TELEFONO` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CLAVE` int(4) NOT NULL,
  `CODSECTOR` int(3) UNSIGNED ZEROFILL NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `abonado`
--

INSERT INTO `abonado` (`ID_ABONADO`, `NOMBRE`, `APELLIDO1`, `APELLIDO2`, `CODZONA`, `DIRECCION`, `TELEFONO`, `CLAVE`, `CODSECTOR`) VALUES
(001, 'ANDRES', 'MASSET', 'RUIZ', 001, 'AVENIDA_EMILIO_LEMOS_9_4A', '954404580', 18, 002),
(002, 'ANTONIO', 'MASSET', 'RUIZ', 001, 'AVENIDA_EMILIO_LEMOS_9_4A', '954404580', 17, 001),
(003, 'FRANCISCO', 'VELEZ', 'LUNA', 001, 'CALLE_SAN_GREGORIO_SN', '955456789', 12, 000),
(004, 'Antonio', 'Hidalgo', 'Sanchez', 002, 'Calle Rioja 5', '601234567', 19, 004),
(005, 'Pedro', 'Sanchez', 'Castejon', 003, 'Calle Rioja 5', '6089101112', 12, 005),
(006, 'Pablo ', 'Iglesias', 'Turrion', 003, 'Calle Rioja 5', '613141516', 18, 006),
(007, 'Francisco', 'Ruiz', 'Vazquez', 003, 'Calle Castilla 38', '613141516', 14, 007),
(008, 'Pablo', 'Casado', 'Blanco', 004, 'Calle San Fernando 2', '617181920', 26, 008),
(009, 'Santiago', 'Abascal', 'Condel', 004, 'Calle Francos 39', '617181920', 19, 009),
(010, 'Gabriel', 'Rufian', 'Rufian', 004, 'Calle Barcelona 5', '621222324', 33, 010),
(011, 'Mariano', 'Rajoy', 'Brey', 004, 'Calle Santiago 15', '625262728', 29, 011),
(012, 'Jose Luis', 'Rodriquez', 'Zapatero', 004, 'Calle Baños 7', '625262728', 18, 012),
(013, 'Jose Maria', 'Aznar', 'Lopez', 004, 'Calle Francos 45', '625262728', 27, 013),
(014, 'Felipe', 'Gonzalez', 'Marquez', 005, 'Calle Cabeza del Rey Don Pedro', '630313233', 28, 014),
(015, 'Gabriel', 'Rodriquez', 'Flores', 005, 'Puerta Jerez 2', '634353637', 34, 015),
(016, 'Adolfo', 'Arenas', 'Arenas', 001, 'Calle San Gregorio n5', '678908070', 10, 000),
(017, 'Fernando', 'Perez', 'Sanchez', 001, 'Avenida de los  Descubrimientos 0', '712456789', 16, 000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sector`
--

CREATE TABLE `sector` (
  `CODSECTOR` int(3) UNSIGNED ZEROFILL NOT NULL,
  `SECTOR` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CODZONA` int(3) UNSIGNED ZEROFILL NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `sector`
--

INSERT INTO `sector` (`CODSECTOR`, `SECTOR`, `CODZONA`) VALUES
(000, 'PALQUILLO', 001),
(001, 'Tribuna', 001),
(002, 'Tribuna B', 001),
(003, 'DUQUE', 001),
(004, 'SIERPES', 002),
(005, 'SECTOR A', 003),
(006, 'SECTOR B', 003),
(007, 'SECTOR C', 003),
(008, 'PALCOS AVENIDA ', 004),
(009, 'BANCO DE ESPAÑA', 004),
(010, 'TRAMO 40 (AVENIDA)', 004),
(011, 'TRAMO 50 (AVENIDA)', 004),
(012, 'TRAMO 60 (AVENIDA)', 004),
(013, 'TRAMO 70 (AVENIDA)', 004),
(014, 'FUENTE', 005),
(015, 'CATEDRAL', 005);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID` int(2) NOT NULL,
  `NOMBRE` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `PASSWORD` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID`, `NOMBRE`, `PASSWORD`) VALUES
(4, 'gabri', 'usuario'),
(5, 'juan', 'usuario'),
(6, 'juanito', 'usuario'),
(1, 'masset', 'usuario'),
(3, 'root', 'root'),
(2, 'usuario', 'usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `zona`
--

CREATE TABLE `zona` (
  `CODZONA` int(3) UNSIGNED ZEROFILL NOT NULL,
  `UBICACION` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `zona`
--

INSERT INTO `zona` (`CODZONA`, `UBICACION`) VALUES
(001, 'LA CAMPANA'),
(002, 'CALLE SIERPES'),
(003, 'PLAZA DE SAN FRANCISCO'),
(004, 'AVENIDA DE LA CONSTITUCION'),
(005, 'PLAZA VIRGEN DE LOS REYES');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `zona_abonado`
--

CREATE TABLE `zona_abonado` (
  `ID_ABONADO` int(3) UNSIGNED ZEROFILL DEFAULT NULL,
  `CODZONA` int(3) UNSIGNED ZEROFILL DEFAULT NULL,
  `CODSECTOR` int(3) UNSIGNED ZEROFILL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `zona_abonado`
--

INSERT INTO `zona_abonado` (`ID_ABONADO`, `CODZONA`, `CODSECTOR`) VALUES
(001, 001, 002),
(003, 001, 000),
(004, 002, 004),
(005, 003, 005),
(006, 003, 006),
(007, 003, 007),
(008, 004, 008),
(009, 004, 009),
(010, 004, 010),
(011, 004, 011),
(012, 004, 012),
(013, 004, 013),
(014, 005, 014),
(015, 005, 015),
(016, 001, 000),
(017, 001, 000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `abonado`
--
ALTER TABLE `abonado`
  ADD PRIMARY KEY (`ID_ABONADO`),
  ADD UNIQUE KEY `PRUEBA` (`ID_ABONADO`,`NOMBRE`,`APELLIDO1`,`APELLIDO2`),
  ADD KEY `FK_ABONADO` (`CODZONA`);

--
-- Indices de la tabla `sector`
--
ALTER TABLE `sector`
  ADD PRIMARY KEY (`CODSECTOR`),
  ADD KEY `FK_SECTOR` (`CODZONA`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`NOMBRE`);

--
-- Indices de la tabla `zona`
--
ALTER TABLE `zona`
  ADD PRIMARY KEY (`CODZONA`);

--
-- Indices de la tabla `zona_abonado`
--
ALTER TABLE `zona_abonado`
  ADD KEY `FK_3` (`CODSECTOR`),
  ADD KEY `FK_1` (`ID_ABONADO`),
  ADD KEY `FK_2` (`CODZONA`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `abonado`
--
ALTER TABLE `abonado`
  ADD CONSTRAINT `FK_ABONADO` FOREIGN KEY (`CODZONA`) REFERENCES `zona` (`CODZONA`);

--
-- Filtros para la tabla `sector`
--
ALTER TABLE `sector`
  ADD CONSTRAINT `FK_SECTOR` FOREIGN KEY (`CODZONA`) REFERENCES `zona` (`CODZONA`);

--
-- Filtros para la tabla `zona_abonado`
--
ALTER TABLE `zona_abonado`
  ADD CONSTRAINT `FK_1` FOREIGN KEY (`ID_ABONADO`) REFERENCES `abonado` (`ID_ABONADO`),
  ADD CONSTRAINT `FK_2` FOREIGN KEY (`CODZONA`) REFERENCES `zona` (`CODZONA`),
  ADD CONSTRAINT `FK_3` FOREIGN KEY (`CODSECTOR`) REFERENCES `sector` (`CODSECTOR`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
