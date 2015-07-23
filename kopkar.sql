-- phpMyAdmin SQL Dump
-- version 2.9.1.1
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Waktu pembuatan: 29. Maret 2014 jam 10:10
-- Versi Server: 5.0.27
-- Versi PHP: 5.2.0
-- 
-- Database: `kopkar`
-- 

-- --------------------------------------------------------

-- 
-- Struktur dari tabel `anggota`
-- 

CREATE TABLE `anggota` (
  `no` int(5) unsigned zerofill NOT NULL auto_increment,
  `nama` varchar(50) NOT NULL,
  `tglLhr` date NOT NULL,
  `jnskel` char(1) NOT NULL,
  `alamat` text NOT NULL,
  `gaji` int(11) NOT NULL,
  PRIMARY KEY  (`no`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

-- 
-- Dumping data untuk tabel `anggota`
-- 

INSERT INTO `anggota` VALUES (00001, 'subagyo', '1970-02-23', 'L', 'kandang panjang', 10000000);
INSERT INTO `anggota` VALUES (00002, 'nunik', '1975-02-24', 'P', 'wonokerto', 50000000);
INSERT INTO `anggota` VALUES (00003, 'dewi', '1980-02-07', 'P', 'tes', 5000000);
INSERT INTO `anggota` VALUES (00004, 'eko', '1977-02-12', 'L', 'tes', 7500000);
INSERT INTO `anggota` VALUES (00005, 'dani', '1968-02-11', 'L', 'tes', 9000000);
INSERT INTO `anggota` VALUES (00006, 'cici', '2014-02-08', 'P', 'tes', 40000);
INSERT INTO `anggota` VALUES (00007, 'uki', '2014-02-12', 'P', 'tes', 15000000);
INSERT INTO `anggota` VALUES (00008, 'ciko', '2014-02-04', 'L', 'tes', 12000000);
INSERT INTO `anggota` VALUES (00009, 'ari', '2014-02-05', 'L', 'tes', 7000000);
INSERT INTO `anggota` VALUES (00010, 'ugi', '2014-02-02', 'L', 'tes', 4000000);

-- --------------------------------------------------------

-- 
-- Struktur dari tabel `mohon`
-- 

CREATE TABLE `mohon` (
  `idMohon` int(5) NOT NULL auto_increment,
  `no` int(5) unsigned zerofill NOT NULL,
  `usia` int(3) NOT NULL,
  `sisagaji` int(11) NOT NULL,
  `tglAjuan` date NOT NULL,
  `jmlPinjam` int(11) NOT NULL,
  `fcktp` char(1) NOT NULL default 'T',
  `fckk` char(1) NOT NULL default 'T',
  `fcgaji` char(1) NOT NULL default 'T',
  `status` varchar(30) NOT NULL,
  PRIMARY KEY  (`idMohon`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

-- 
-- Dumping data untuk tabel `mohon`
-- 

INSERT INTO `mohon` VALUES (1, 00002, 44, 1250000, '2014-02-08', 500000, 'T', 'Y', 'T', 'Pending');
INSERT INTO `mohon` VALUES (2, 00001, 44, 250000, '2014-02-24', 100000, 'Y', 'Y', 'Y', 'Lengkap');
INSERT INTO `mohon` VALUES (3, 00003, 34, 125000, '2014-03-26', 1250000, 'Y', 'Y', 'Y', 'Lengkap');
INSERT INTO `mohon` VALUES (4, 00004, 37, 187500, '2014-03-28', 100000, 'Y', 'Y', 'Y', 'Lengkap');

-- --------------------------------------------------------

-- 
-- Struktur dari tabel `tbl_login`
-- 

CREATE TABLE `tbl_login` (
  `usr` varchar(255) NOT NULL,
  `passwd` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- 
-- Dumping data untuk tabel `tbl_login`
-- 

INSERT INTO `tbl_login` VALUES ('admin', '21232f297a57a5a743894a0e4a801fc3');
