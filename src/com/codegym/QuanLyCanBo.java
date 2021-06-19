package com.codegym;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyCanBo {
    public static Scanner sc = new Scanner(System.in);
    static ArrayList<CanBo> list = new ArrayList<>();

    public static void addNhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        list.add(new NhanVien(hoTen, ngaySinh, gioiTinh, diaChi));
    }

    public static void addCongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String capBac, String nganhNghe) {
        list.add(new CongNhan(hoTen, ngaySinh, gioiTinh, diaChi, capBac, nganhNghe));
    }

    public static void addKySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhNghe) {
        list.add(new KySu(hoTen, ngaySinh, gioiTinh, diaChi, nganhNghe));
    }

    static void findByName() {
        System.out.println("Nhập tên: ");
        String nameSearch = sc.nextLine();
        for (CanBo s : list) {
            if (s instanceof NhanVien) {
                if (((NhanVien) s).getHoTen().equals(nameSearch)) {
                    s.display();
                }
            } else if (s instanceof CongNhan) {
                if (((CongNhan) s).getHoTen().equals(nameSearch)) {
                    s.display();
                }
            } else if (s instanceof KySu) {
                if (((KySu) s).getHoTen().equals(nameSearch)) {
                    s.display();
                }
            }
        }
    }

    public static void removeByName(String name) {
        CanBo target = null;
        for (CanBo s : list) {
            if (s.getHoTen().equals(name)) {
                target = s;
            }
        }
        list.remove(target);
    }

    public static void updateByName(String name) {
        for (CanBo s : list) {
            if (s.getHoTen().equals(name)) {
                if (s instanceof NhanVien) {
                    System.out.println("Nhập Địa chỉ: ");
                    String diaChi = sc.nextLine();
                    System.out.println("Nhập Năm sinh");
                    String namSinh = sc.nextLine();
                    System.out.println("Nhập Giới tính");
                    String gioiTinh = sc.nextLine();
                    ((NhanVien) s).setDiaChi(diaChi);
                    ((NhanVien) s).setNamSinh(namSinh);
                    ((NhanVien) s).setGioiTinh(gioiTinh);
                } else if (s instanceof CongNhan) {
                    System.out.println("Nhập Địa chỉ: ");
                    String diaChi = sc.nextLine();
                    System.out.println("Nhập Năm sinh");
                    String namSinh = sc.nextLine();
                    System.out.println("Nhập Giới tính");
                    String gioiTinh = sc.nextLine();
                    System.out.println("Nhập Cấp bậc: ");
                    String capBac = sc.nextLine();
                    System.out.println("Nhập Ngành nghề: ");
                    String nganhNghe = sc.nextLine();

                    ((CongNhan) s).setDiaChi(diaChi);
                    ((CongNhan) s).setNamSinh(namSinh);
                    ((CongNhan) s).setGioiTinh(gioiTinh);
                    ((CongNhan) s).setCapBac(capBac);
                    ((CongNhan) s).setNganhNghe(nganhNghe);
                } else if (s instanceof KySu) {
                    System.out.println("Nhập Địa chỉ: ");
                    String diaChi = sc.nextLine();
                    System.out.println("Nhập Năm sinh");
                    String namSinh = sc.nextLine();
                    System.out.println("Nhập Giới tính");
                    String gioiTinh = sc.nextLine();
                    System.out.println("Nhập Ngành nghề: ");
                    String nganhNghe = sc.nextLine();

                    ((KySu) s).setDiaChi(diaChi);
                    ((KySu) s).setNamSinh(namSinh);
                    ((KySu) s).setGioiTinh(gioiTinh);
                    ((KySu) s).setNganhNghe(nganhNghe);
                }
            } else System.out.println("Không có nhân viên tên " + name + " trong danh sách");
        }
    }

    public static void show() {
        for (CanBo s : list) {
            s.display();
        }
    }

    public static void sortByName() {
        Comparator nameComporator = new NameComparator();
        list.sort(nameComporator);
    }

    public static void searchBySpecialty() {
        System.out.println("Nhập ngành: ");
        String nganhNghe = sc.nextLine();
        for (CanBo s : list) {
            if (s instanceof CongNhan) {
                if (((CongNhan) s).getNganhNghe().equals(nganhNghe)) {
                    s.display();
                }
            } else if (s instanceof KySu) {
                if (((KySu) s).getNganhNghe().equals(nganhNghe)) {
                    s.display();
                }
            }
        }
    }


}
