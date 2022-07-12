package OOP;

import OOP.HinhChuNhat;

public class main {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(9,10);
        System.out.println(hinhChuNhat.tinhChuVi());
        System.out.println(hinhChuNhat.tinhDienTich());
        HinhThang hinhThang = new HinhThang(10,6,4);
        System.out.println(hinhThang.tinhChuVi());
        System.out.println(hinhThang.tinhDienTich());
    }
}
