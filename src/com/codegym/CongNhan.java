package com.codegym;

public class CongNhan extends CanBo {
    private String capBac;
    private String nganhNghe;

    public CongNhan(String hoTen, String namSinh, String gioiTinh, String diaChi, String capBac, String nganhNghe) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.capBac = capBac;
        this.nganhNghe = nganhNghe;
    }

    public CongNhan(String capBac, String nganhNghe) {
        this.capBac = capBac;
        this.nganhNghe = nganhNghe;
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    public String getNganhNghe() {
        return nganhNghe;
    }

    public void setNganhNghe(String nganhNghe) {
        this.nganhNghe = nganhNghe;
    }



    public void display() {
        System.out.println("Họ tên: " + this.getHoTen()
                + ", Năm sinh: " + this.getNamSinh()
                + ", Giới tính: " + this.getGioiTinh()
                + ", Địa chỉ: " + this.getDiaChi()
                + ", Bậc: " + this.getCapBac()
                + ", Ngành: " + this.getNganhNghe());
    }
}
