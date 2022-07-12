package OOP;

import OOP.OOP_Buoi1;

public class HinhChuNhat extends OOP_Buoi1 {
    public int chieuDai;
    public int chieuRong;

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
    }

    @Override
    public double tinhDienTich() {
        return chieuRong * chieuDai;
    }

    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong) *2;
    }

}
