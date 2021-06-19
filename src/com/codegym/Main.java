package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Quản lý cán bộ: ");
            System.out.println("1. Thêm cán bộ: ");
            System.out.println("2. Tìm kiếm theo họ tên:");
            System.out.println("3. Xóa nhân viên theo tên:");
            System.out.println("4. Sửa nhân viên theo tên:");
            System.out.println("5. Hiển thị:");
            System.out.println("6. Sắp xếp theo tên:");
            System.out.println("7. Tìm kiếm theo ngành:");
            System.out.println("0. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chọn loại cán bộ cần thêm:");
                    System.out.println("1. Thêm nhân viên: ");
                    System.out.println("2. Thêm công nhân: ");
                    System.out.println("3. Thêm kỹ sư: ");
                    int choice1 = Integer.parseInt(sc.nextLine());
                    switch (choice1) {
                        case 1:
                            System.out.println("Nhập họ tên: ");
                            String hoTenNV = sc.nextLine();
                            System.out.println("Nhập năm sinh: ");
                            String namSinhNV = sc.nextLine();
                            System.out.println("Nhập giới tính: ");
                            String gioiTinhNV = sc.nextLine();
                            System.out.println("Nhập địa chỉ: ");
                            String diaChiNV = sc.nextLine();

                            QuanLyCanBo.addNhanVien(hoTenNV, namSinhNV, gioiTinhNV, diaChiNV);
                            QuanLyCanBo.show();
                            break;
                        case 2:
                            System.out.println("Nhập họ tên: ");
                            String hoTenCN = sc.nextLine();
                            System.out.println("Nhập năm sinh: ");
                            String namSinhCN = sc.nextLine();
                            System.out.println("Nhập giới tính: ");
                            String gioiTinhCN = sc.nextLine();
                            System.out.println("Nhập địa chỉ: ");
                            String diaChiCN = sc.nextLine();
                            System.out.println("Nhập bậc: ");
                            String capBacCN = sc.nextLine();
                            System.out.println("Nhập ngành nghề: ");
                            String nganhNgheCN = sc.nextLine();

                            QuanLyCanBo.addCongNhan(hoTenCN, namSinhCN, gioiTinhCN, diaChiCN, capBacCN, nganhNgheCN);
                            QuanLyCanBo.show();
                            break;
                        case 3:
                            System.out.println("Nhập họ tên: ");
                            String hoTenKS = sc.nextLine();
                            System.out.println("Nhập năm sinh: ");
                            String namSinhKS = sc.nextLine();
                            System.out.println("Nhập giới tính: ");
                            String gioiTinhKS = sc.nextLine();
                            System.out.println("Nhập địa chỉ: ");
                            String diaChiKS = sc.nextLine();
                            System.out.println("Nhập ngành nghề: ");
                            String nganhNgheKS = sc.nextLine();

                            QuanLyCanBo.addKySu(hoTenKS, namSinhKS, gioiTinhKS, diaChiKS, nganhNgheKS);
                            QuanLyCanBo.show();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Tìm kiếm theo tên: ");
                    QuanLyCanBo.findByName();
                    break;
                case 3:
                    System.out.println("Nhập tên cần tìm: ");
                    String nameRemove = sc.nextLine();

                    QuanLyCanBo.removeByName(nameRemove);
                    QuanLyCanBo.show();
                    break;
                case 4:
                    System.out.println("Nhập tên cần edit");
                    String nameUpdate = sc.nextLine();

                    QuanLyCanBo.updateByName(nameUpdate);
                    QuanLyCanBo.show();
                    break;
                case 5:
                    System.out.println("Danh sách cán bộ: ");

                    QuanLyCanBo.show();
                    break;
                case 6:
                    System.out.println("Sắp xếp: ");

                    QuanLyCanBo.sortByName();
                    QuanLyCanBo.show();
                    break;
                case 7:
                    System.out.println("Tìm kiếm toàn bộ theo ngành: ");

                    QuanLyCanBo.searchBySpecialty();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
