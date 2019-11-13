package com.t3h.main;

import com.t3h.sinhvien.NhanVien;
import com.t3h.sinhvien.SinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String ten=sc.next();
        int tuoi = sc.nextInt(); */
        SinhVien sv = new SinhVien();
        sv.nhap("Hương",
                15,
                true,
                9.0f,
                "hóa");

        sv.inThongTin();
        sv.hocBai();
        sv.thi();
        System.out.println("---------------------------------------");
        NhanVien nv = new NhanVien();
        nv.nhap("Hong",
                19,
                true,
                "sale",
                "nhan vien",
                600,
                1.5f);
        nv.inThongTin();
        nv.luong();
    }
}
