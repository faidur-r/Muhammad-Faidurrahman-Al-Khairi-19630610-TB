-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Jan 2022 pada 06.53
-- Versi server: 10.4.17-MariaDB
-- Versi PHP: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_warnet`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_komputer`
--

CREATE TABLE `tb_komputer` (
  `id_kom` int(11) NOT NULL,
  `Nama` varchar(25) NOT NULL,
  `CPU` varchar(50) NOT NULL,
  `GPU` varchar(50) NOT NULL,
  `RAM` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_komputer`
--

INSERT INTO `tb_komputer` (`id_kom`, `Nama`, `CPU`, `GPU`, `RAM`) VALUES
(1, 'Kom 1', 'AMD Ryzen 3 2200U', 'AMD Raedon Vega 3', '8 GB'),
(2, 'Kom 2', 'AMD Ryzen 3 2400U', 'AMD Raedon Vega 5', '8 GB'),
(4, 'Kom 3', 'AMD Ryzen 5 3400U', 'AMD Raedon Vega 5', '8 GB'),
(5, 'Kom 4', 'AMD Ryzen 5 3400U', 'AMD Raedon Vega 5', '8 GB'),
(6, 'Kom 5', 'AMD Ryzen 5 3700U', 'AMD Raedon Vega 5', '8 GB'),
(7, 'Kom 6', 'AMD Ryzen 5 5700U', 'AMD Raedon Vega 7', '8 GB'),
(8, 'Kom 7', 'AMD Ryzen 7 3200U', 'AMD Raedon Vega 7', '8 GB'),
(11, 'Kom 8', 'AMD Ryzen 7 5200U', 'AMD Raedon Vega 7', '8 GB'),
(14, 'Kom 9', 'AMD Ryzen 9 5200U', 'AMD Raedon Vega 7', '8 GB');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_laporan`
--

CREATE TABLE `tb_laporan` (
  `id` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `komputer` varchar(10) NOT NULL,
  `durasi` varchar(10) NOT NULL,
  `harga` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_laporan`
--

INSERT INTO `tb_laporan` (`id`, `username`, `komputer`, `durasi`, `harga`) VALUES
(1, 'faidur', 'Kom 2', '2 Jam', 'Rp. 10.000'),
(2, 'rahman', 'Kom 6', '5 Jam', 'Rp. 22.000'),
(3, 'karen', 'Kom 4', '4 Jam', 'Rp. 17.000'),
(4, 'ren', 'Kom 3', '3 Jam', 'Rp. 12.000'),
(5, 'faidurr', 'Kom 5', '6 Jam', 'Rp. 27.000'),
(6, 'reni', 'Kom 9', '7 Jam', 'Rp. 30.000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_user`
--

CREATE TABLE `tb_user` (
  `userid` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_user`
--

INSERT INTO `tb_user` (`userid`, `username`, `password`) VALUES
(1, 'faidur', 'keren0321'),
(4, 'rahman', 'rahman0321'),
(5, 'karen', 'karen0321'),
(7, 'ren', 'ren0321'),
(11, 'faidurr', 'faidurrr0321'),
(12, 'reni', 'reni0321');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_komputer`
--
ALTER TABLE `tb_komputer`
  ADD PRIMARY KEY (`id_kom`);

--
-- Indeks untuk tabel `tb_laporan`
--
ALTER TABLE `tb_laporan`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`userid`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_komputer`
--
ALTER TABLE `tb_komputer`
  MODIFY `id_kom` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT untuk tabel `tb_laporan`
--
ALTER TABLE `tb_laporan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
