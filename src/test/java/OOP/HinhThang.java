package OOP;

public class HinhThang extends OOP_Buoi1{
    public int chieuDai;
    public int chieuRong;
    public int chieuCao;

    public HinhThang(int chieuDai, int chieuRong, int chieuCao) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhDienTich() {
        return ((chieuDai+ chieuRong)*chieuCao) /2;
    }

    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong);
    }
}
