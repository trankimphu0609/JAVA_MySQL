-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 18, 2021 at 03:54 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `librarydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieumuon`
--

CREATE TABLE `chitietphieumuon` (
  `maPM` int(11) NOT NULL,
  `maDS` int(11) NOT NULL,
  `soluong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `chitietphieumuon`
--

INSERT INTO `chitietphieumuon` (`maPM`, `maDS`, `soluong`) VALUES
(0, 1, 2),
(0, 2, 1),
(1, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `idphieunhap` int(11) NOT NULL,
  `maDS` int(11) NOT NULL,
  `Tensach` varchar(255) NOT NULL,
  `soluong` int(11) NOT NULL,
  `dongia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chitietphieunhap`
--

INSERT INTO `chitietphieunhap` (`idphieunhap`, `maDS`, `Tensach`, `soluong`, `dongia`) VALUES
(1, 2, 'Truyen chu', 2, 20000),
(2, 1, 'truyen tranh', 2, 10000),
(2, 3, 'Sách', 1, 10000),
(2, 4, 'Sách2', 2, 10000);

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieutra`
--

CREATE TABLE `chitietphieutra` (
  `maPT` int(11) NOT NULL,
  `maDS` int(11) NOT NULL,
  `soluongtra` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chitietphieutra`
--

INSERT INTO `chitietphieutra` (`maPT`, `maDS`, `soluongtra`) VALUES
(0, 1, 1),
(0, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `chitietsachmuon`
--

CREATE TABLE `chitietsachmuon` (
  `maPM` int(11) NOT NULL,
  `maDS` int(11) NOT NULL,
  `masachcon` int(11) NOT NULL,
  `maTT` varchar(255) CHARACTER SET utf8mb4 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `chitietsachmuon`
--

INSERT INTO `chitietsachmuon` (`maPM`, `maDS`, `masachcon`, `maTT`) VALUES
(0, 1, 1, '4'),
(0, 1, 2, '4'),
(0, 2, 1, '4'),
(1, 1, 1, '4'),
(1, 1, 4, '4');

-- --------------------------------------------------------

--
-- Table structure for table `chitietsachtra`
--

CREATE TABLE `chitietsachtra` (
  `maPT` int(11) NOT NULL,
  `maDS` int(11) NOT NULL,
  `masachcon` int(11) NOT NULL,
  `maTT` varchar(255) CHARACTER SET utf8mb4 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `chitietsachtra`
--

INSERT INTO `chitietsachtra` (`maPT`, `maDS`, `masachcon`, `maTT`) VALUES
(0, 2, 1, '3'),
(0, 1, 1, '4');

-- --------------------------------------------------------

--
-- Table structure for table `chucvu`
--

CREATE TABLE `chucvu` (
  `maCV` int(11) NOT NULL,
  `tenCV` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chucvu`
--

INSERT INTO `chucvu` (`maCV`, `tenCV`) VALUES
(1, 'Quản lý'),
(2, 'Nhân viên');

-- --------------------------------------------------------

--
-- Table structure for table `dausach`
--

CREATE TABLE `dausach` (
  `maDS` int(11) NOT NULL,
  `tensach` varchar(255) NOT NULL,
  `soluong` int(11) NOT NULL,
  `maTG` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dausach`
--

INSERT INTO `dausach` (`maDS`, `tensach`, `soluong`, `maTG`) VALUES
(1, 'truyen tranh', 3, 1),
(2, 'Truyen chu', 2, 2),
(3, 'Sách', 1, 1),
(4, 'Sách1', 2, 16);

-- --------------------------------------------------------

--
-- Table structure for table `docgia`
--

CREATE TABLE `docgia` (
  `maDG` int(11) NOT NULL,
  `ho` varchar(255) NOT NULL,
  `ten` varchar(255) NOT NULL,
  `ngaysinh` date NOT NULL,
  `address` varchar(255) NOT NULL,
  `sdt` int(11) NOT NULL,
  `trinhdo` varchar(255) NOT NULL,
  `noicongtac` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `docgia`
--

INSERT INTO `docgia` (`maDG`, `ho`, `ten`, `ngaysinh`, `address`, `sdt`, `trinhdo`, `noicongtac`) VALUES
(1, 'Nguyễn', 'Thị A', '2001-11-17', '198 Hai Bà Trưng', 927365899, 'Đại học', 'Trường ĐH'),
(2, 'Trần ', 'Văn B', '2000-11-12', '198 BT', 981280129, 'Đại học', 'Truờng Đh'),
(3, 'Lê', 'Hoàng Phúc', '2001-01-01', 'q12', 123456789, 'Đại học ', 'DHSG');

-- --------------------------------------------------------

--
-- Table structure for table `dstinhtrang`
--

CREATE TABLE `dstinhtrang` (
  `maTT` varchar(255) NOT NULL,
  `tinhtrang` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dstinhtrang`
--

INSERT INTO `dstinhtrang` (`maTT`, `tinhtrang`) VALUES
('1', 'Rách'),
('2', 'Mất'),
('3', 'Cũ'),
('4', 'Mới');

-- --------------------------------------------------------

--
-- Table structure for table `ncc`
--

CREATE TABLE `ncc` (
  `maNCC` varchar(255) NOT NULL,
  `tenNCC` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `SDT` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ncc`
--

INSERT INTO `ncc` (`maNCC`, `tenNCC`, `address`, `email`, `SDT`) VALUES
('1', 'Kim Đồng', '211 hahj', 'abc@gmail.com', 918331089);

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `maNV` int(11) NOT NULL,
  `ho` varchar(255) NOT NULL,
  `ten` varchar(255) NOT NULL,
  `ngaysinh` date NOT NULL,
  `address` varchar(255) NOT NULL,
  `sdt` int(11) NOT NULL,
  `luong` int(11) NOT NULL,
  `maCV` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`maNV`, `ho`, `ten`, `ngaysinh`, `address`, `sdt`, `luong`, `maCV`) VALUES
(1, 'Nguyễn', 'Văn A', '1997-04-14', '279 Hồng Bàng', 927365899, 100000000, 1),
(2, 'Huỳnh', 'Thị B', '1997-04-15', '211 Minh Phụng', 927365898, 10000000, 2),
(3, 'Nguyễn', 'Văn B', '2001-05-09', 'q2', 123456789, 100000000, 2),
(4, 'Trần', 'Kim Phú', '2001-09-06', 'q8', 373727265, 123456789, 1);

-- --------------------------------------------------------

--
-- Table structure for table `phieumuon`
--

CREATE TABLE `phieumuon` (
  `maPM` int(11) NOT NULL,
  `matheTV` int(11) NOT NULL,
  `ngaymuon` date NOT NULL,
  `ngayhentra` date NOT NULL,
  `maNV` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phieumuon`
--

INSERT INTO `phieumuon` (`maPM`, `matheTV`, `ngaymuon`, `ngayhentra`, `maNV`) VALUES
(0, 2, '2021-05-17', '2022-10-10', 1),
(1, 2, '2021-05-18', '2021-06-18', 1);

-- --------------------------------------------------------

--
-- Table structure for table `phieunhapsach`
--

CREATE TABLE `phieunhapsach` (
  `idphieunhap` int(11) NOT NULL,
  `maNCC` varchar(255) NOT NULL,
  `maNV` int(11) NOT NULL,
  `ngaynhap` date NOT NULL,
  `tongtien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phieunhapsach`
--

INSERT INTO `phieunhapsach` (`idphieunhap`, `maNCC`, `maNV`, `ngaynhap`, `tongtien`) VALUES
(1, '1', 1, '2021-05-14', 1000000),
(2, '1', 1, '2021-05-16', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `phieutra`
--

CREATE TABLE `phieutra` (
  `maPT` int(11) NOT NULL,
  `maPM` int(11) NOT NULL,
  `ngaytra` date NOT NULL,
  `maNV` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phieutra`
--

INSERT INTO `phieutra` (`maPT`, `maPM`, `ngaytra`, `maNV`) VALUES
(0, 0, '2021-05-17', 1);

-- --------------------------------------------------------

--
-- Table structure for table `quyen`
--

CREATE TABLE `quyen` (
  `maquyen` int(11) NOT NULL,
  `tenquyen` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `quyen`
--

INSERT INTO `quyen` (`maquyen`, `tenquyen`) VALUES
(1, 'Admin'),
(2, 'Member');

-- --------------------------------------------------------

--
-- Table structure for table `sachcon`
--

CREATE TABLE `sachcon` (
  `maDS` int(111) NOT NULL,
  `masachcon` int(11) NOT NULL,
  `maTT` varchar(255) CHARACTER SET utf8mb4 NOT NULL,
  `hientrang` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `sachcon`
--

INSERT INTO `sachcon` (`maDS`, `masachcon`, `maTT`, `hientrang`) VALUES
(1, 1, '4', 0),
(2, 1, '3', 1),
(3, 1, '4', 1),
(4, 1, '4', 1),
(1, 2, '4', 0),
(2, 2, '4', 1),
(4, 2, '4', 1),
(1, 3, '4', 1),
(2, 3, '4', 1),
(1, 4, '4', 0),
(2, 4, '4', 1),
(1, 5, '4', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tacgia`
--

CREATE TABLE `tacgia` (
  `maTG` int(11) NOT NULL,
  `ho` varchar(255) NOT NULL,
  `ten` varchar(255) NOT NULL,
  `sdt` int(11) NOT NULL,
  `address` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tacgia`
--

INSERT INTO `tacgia` (`maTG`, `ho`, `ten`, `sdt`, `address`) VALUES
(1, 'Nguyễn', 'Nhật Ánh', 12345678, 'sdiofsds'),
(2, 'Trần', 'Văn A', 99999999, '90181 jshak'),
(16, 'Nguyễn', 'A', 0, 'null');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `maTK` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `matkhau` varchar(255) NOT NULL,
  `maquyen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`maTK`, `username`, `matkhau`, `maquyen`) VALUES
(1, 'admin', 'ab12345', 1),
(2, 'ABC', 'ab1235', 2),
(4, 'trankimphu', '12345', 1);

-- --------------------------------------------------------

--
-- Table structure for table `thethuvien`
--

CREATE TABLE `thethuvien` (
  `matheTV` int(11) NOT NULL,
  `maDG` int(11) NOT NULL,
  `ngaylamthe` date NOT NULL,
  `ngayhethan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `thethuvien`
--

INSERT INTO `thethuvien` (`matheTV`, `maDG`, `ngaylamthe`, `ngayhethan`) VALUES
(1, 1, '2021-03-02', '2021-05-01'),
(2, 2, '2020-10-10', '2021-10-10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chitietphieumuon`
--
ALTER TABLE `chitietphieumuon`
  ADD PRIMARY KEY (`maPM`,`maDS`),
  ADD KEY `maPM` (`maPM`),
  ADD KEY `maDS` (`maDS`);

--
-- Indexes for table `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD PRIMARY KEY (`idphieunhap`,`maDS`) USING BTREE,
  ADD KEY `maDS` (`maDS`),
  ADD KEY `idphieunhap` (`idphieunhap`);

--
-- Indexes for table `chitietphieutra`
--
ALTER TABLE `chitietphieutra`
  ADD PRIMARY KEY (`maPT`,`maDS`),
  ADD KEY `maPT` (`maPT`),
  ADD KEY `maPT_2` (`maPT`),
  ADD KEY `maDS` (`maDS`);

--
-- Indexes for table `chitietsachmuon`
--
ALTER TABLE `chitietsachmuon`
  ADD PRIMARY KEY (`maPM`,`maDS`,`masachcon`),
  ADD KEY `maDS` (`maDS`),
  ADD KEY `maPM` (`maPM`),
  ADD KEY `maTT` (`maTT`),
  ADD KEY `masachcon` (`masachcon`);

--
-- Indexes for table `chitietsachtra`
--
ALTER TABLE `chitietsachtra`
  ADD PRIMARY KEY (`maPT`,`maDS`,`masachcon`),
  ADD KEY `maPT` (`maPT`),
  ADD KEY `maDS` (`maDS`),
  ADD KEY `masachcon` (`masachcon`),
  ADD KEY `maTT` (`maTT`);

--
-- Indexes for table `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`maCV`);

--
-- Indexes for table `dausach`
--
ALTER TABLE `dausach`
  ADD PRIMARY KEY (`maDS`),
  ADD KEY `maTG` (`maTG`);

--
-- Indexes for table `docgia`
--
ALTER TABLE `docgia`
  ADD PRIMARY KEY (`maDG`) USING BTREE;

--
-- Indexes for table `dstinhtrang`
--
ALTER TABLE `dstinhtrang`
  ADD PRIMARY KEY (`maTT`) USING BTREE;

--
-- Indexes for table `ncc`
--
ALTER TABLE `ncc`
  ADD PRIMARY KEY (`maNCC`) USING BTREE;

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`maNV`) USING BTREE,
  ADD KEY `maCV` (`maCV`);

--
-- Indexes for table `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD PRIMARY KEY (`maPM`),
  ADD KEY `matheTV` (`matheTV`),
  ADD KEY `maNV` (`maNV`);

--
-- Indexes for table `phieunhapsach`
--
ALTER TABLE `phieunhapsach`
  ADD PRIMARY KEY (`idphieunhap`) USING BTREE,
  ADD KEY `maNCC` (`maNCC`),
  ADD KEY `maNV` (`maNV`);

--
-- Indexes for table `phieutra`
--
ALTER TABLE `phieutra`
  ADD PRIMARY KEY (`maPT`),
  ADD KEY `maPM` (`maPM`),
  ADD KEY `maNV` (`maNV`);

--
-- Indexes for table `quyen`
--
ALTER TABLE `quyen`
  ADD PRIMARY KEY (`maquyen`);

--
-- Indexes for table `sachcon`
--
ALTER TABLE `sachcon`
  ADD PRIMARY KEY (`masachcon`,`maDS`),
  ADD KEY `maDS` (`maDS`),
  ADD KEY `maTT` (`maTT`);

--
-- Indexes for table `tacgia`
--
ALTER TABLE `tacgia`
  ADD PRIMARY KEY (`maTG`) USING BTREE;

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`maTK`),
  ADD KEY `maQ` (`maquyen`),
  ADD KEY `maTK` (`maTK`);

--
-- Indexes for table `thethuvien`
--
ALTER TABLE `thethuvien`
  ADD PRIMARY KEY (`matheTV`) USING BTREE,
  ADD KEY `maDG` (`maDG`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sachcon`
--
ALTER TABLE `sachcon`
  MODIFY `masachcon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tacgia`
--
ALTER TABLE `tacgia`
  MODIFY `maTG` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chitietphieumuon`
--
ALTER TABLE `chitietphieumuon`
  ADD CONSTRAINT `chitietphieumuon_ibfk_1` FOREIGN KEY (`maPM`) REFERENCES `phieumuon` (`maPM`) ON DELETE CASCADE,
  ADD CONSTRAINT `chitietphieumuon_ibfk_2` FOREIGN KEY (`maDS`) REFERENCES `dausach` (`maDS`);

--
-- Constraints for table `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD CONSTRAINT `chitietphieunhap_ibfk_1` FOREIGN KEY (`idphieunhap`) REFERENCES `phieunhapsach` (`idphieunhap`) ON DELETE CASCADE,
  ADD CONSTRAINT `chitietphieunhap_ibfk_2` FOREIGN KEY (`maDS`) REFERENCES `dausach` (`maDS`);

--
-- Constraints for table `chitietphieutra`
--
ALTER TABLE `chitietphieutra`
  ADD CONSTRAINT `chitietphieutra_ibfk_1` FOREIGN KEY (`maPT`) REFERENCES `phieutra` (`maPT`) ON DELETE CASCADE,
  ADD CONSTRAINT `chitietphieutra_ibfk_2` FOREIGN KEY (`maDS`) REFERENCES `dausach` (`maDS`);

--
-- Constraints for table `chitietsachmuon`
--
ALTER TABLE `chitietsachmuon`
  ADD CONSTRAINT `chitietsachmuon_ibfk_1` FOREIGN KEY (`maPM`) REFERENCES `chitietphieumuon` (`maPM`) ON DELETE CASCADE,
  ADD CONSTRAINT `chitietsachmuon_ibfk_2` FOREIGN KEY (`maDS`) REFERENCES `chitietphieumuon` (`maDS`) ON DELETE CASCADE,
  ADD CONSTRAINT `chitietsachmuon_ibfk_3` FOREIGN KEY (`masachcon`) REFERENCES `sachcon` (`masachcon`),
  ADD CONSTRAINT `chitietsachmuon_ibfk_4` FOREIGN KEY (`maTT`) REFERENCES `dstinhtrang` (`maTT`);

--
-- Constraints for table `chitietsachtra`
--
ALTER TABLE `chitietsachtra`
  ADD CONSTRAINT `chitietsachtra_ibfk_1` FOREIGN KEY (`maPT`) REFERENCES `chitietphieutra` (`maPT`) ON DELETE CASCADE,
  ADD CONSTRAINT `chitietsachtra_ibfk_2` FOREIGN KEY (`maDS`) REFERENCES `chitietphieutra` (`maDS`) ON DELETE CASCADE,
  ADD CONSTRAINT `chitietsachtra_ibfk_4` FOREIGN KEY (`maTT`) REFERENCES `dstinhtrang` (`maTT`),
  ADD CONSTRAINT `chitietsachtra_ibfk_5` FOREIGN KEY (`masachcon`) REFERENCES `sachcon` (`masachcon`);

--
-- Constraints for table `dausach`
--
ALTER TABLE `dausach`
  ADD CONSTRAINT `dausach_ibfk_1` FOREIGN KEY (`maTG`) REFERENCES `tacgia` (`maTG`);

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`maCV`) REFERENCES `chucvu` (`maCV`);

--
-- Constraints for table `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD CONSTRAINT `phieumuon_ibfk_1` FOREIGN KEY (`matheTV`) REFERENCES `thethuvien` (`matheTV`),
  ADD CONSTRAINT `phieumuon_ibfk_2` FOREIGN KEY (`maNV`) REFERENCES `nhanvien` (`maNV`);

--
-- Constraints for table `phieunhapsach`
--
ALTER TABLE `phieunhapsach`
  ADD CONSTRAINT `phieunhapsach_ibfk_1` FOREIGN KEY (`maNCC`) REFERENCES `ncc` (`maNCC`),
  ADD CONSTRAINT `phieunhapsach_ibfk_2` FOREIGN KEY (`maNV`) REFERENCES `nhanvien` (`maNV`);

--
-- Constraints for table `phieutra`
--
ALTER TABLE `phieutra`
  ADD CONSTRAINT `phieutra_ibfk_1` FOREIGN KEY (`maPM`) REFERENCES `phieumuon` (`maPM`);

--
-- Constraints for table `sachcon`
--
ALTER TABLE `sachcon`
  ADD CONSTRAINT `sachcon_ibfk_1` FOREIGN KEY (`maDS`) REFERENCES `dausach` (`maDS`) ON DELETE CASCADE,
  ADD CONSTRAINT `sachcon_ibfk_2` FOREIGN KEY (`maTT`) REFERENCES `dstinhtrang` (`maTT`);

--
-- Constraints for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`maquyen`) REFERENCES `quyen` (`maquyen`),
  ADD CONSTRAINT `taikhoan_ibfk_2` FOREIGN KEY (`maTK`) REFERENCES `nhanvien` (`maNV`) ON DELETE CASCADE;

--
-- Constraints for table `thethuvien`
--
ALTER TABLE `thethuvien`
  ADD CONSTRAINT `thethuvien_ibfk_1` FOREIGN KEY (`maDG`) REFERENCES `docgia` (`maDG`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
