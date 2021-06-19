package com.codegym;

public class CanBo {
    private String hoTen;
    private String namSinh;
    private String gioiTinh;
    private String diaChi;

    public CanBo(String hoTen, String namSinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public CanBo() {

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    public void display() {
        System.out.println("Họ tên: " + this.getHoTen()
                + ", Năm sinh: " + this.getNamSinh()
                + ", Giới tính: " + this.getGioiTinh()
                + ", Địa chỉ: " + this.getDiaChi());
    }
}
