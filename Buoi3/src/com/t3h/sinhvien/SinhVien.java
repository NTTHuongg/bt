package com.t3h.sinhvien;

public class SinhVien {
    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    private float diem;
    private String nganhHoc;

    public void nhap(String giaTriTen, int giaTriTuoi, boolean giatriGioiTinh, float giaTriDiem, String giaTriNganh){
        ten = giaTriTen;
        tuoi= giaTriTuoi;
        gioiTinh = giatriGioiTinh;
        diem = giaTriDiem;
        nganhHoc = giaTriNganh;
    }

    public void hocBai(){
        System.out.println("sv học bài");
    }

    public void thi(){
        System.out.println("thi cuối kì");
    }

    public void inThongTin(){
        System.out.println("Họ tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        if(gioiTinh == true){
            System.out.println("Giới tính là: nam");
        }
        else{
            System.out.println("Giới tính là nữ");
        }
        System.out.println("điểm: " +diem);
        System.out.println("Ngành học: " + nganhHoc);
    }
}
