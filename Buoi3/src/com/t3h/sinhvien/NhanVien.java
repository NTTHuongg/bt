package com.t3h.sinhvien;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class NhanVien {
    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    private String ngheNghiep;
    private String chucVu;
    private int luong;
    private float heSoLuong;

    public void nhap(String giaTriTen,
                           int giaTriTuoi,
                           boolean giaTriGioiTinh,
                           String giaTriNgheNghiep,
                           String giaTriChucVu,
                           int giaTriLuong,
                           float giaTriHSL){
        ten=giaTriTen;
        tuoi=giaTriTuoi;
        gioiTinh=giaTriGioiTinh;
        ngheNghiep=giaTriNgheNghiep;
        chucVu=giaTriChucVu;
        luong=giaTriLuong;
        heSoLuong=giaTriHSL;
    }

    public void inThongTin(){
        System.out.println("ho ten: " + ten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("gioi tinh: " + (gioiTinh == true ? "nam" : "nu") );
        System.out.println("nghe nghiep:" + ngheNghiep);
        System.out.println("chuc vu: "+chucVu);
    }
    public void luong(){
        System.out.println("luong la: " + luong*heSoLuong);
    }


}
