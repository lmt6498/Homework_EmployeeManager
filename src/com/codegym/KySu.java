package com.codegym;

public class KySu extends CanBo {
    private String nganhNghe;

    public KySu(String hoTen, String namSinh, String gioiTinh, String diaChi, String nganhNghe) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganhNghe = nganhNghe;
    }

    public KySu(String nganhNghe) {
        this.nganhNghe = nganhNghe;
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
                + ", Ngành: " + this.getNganhNghe());
    }
}
