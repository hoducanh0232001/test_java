package QuanLyDacSan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        DacSan ds = new DacSan(1,"sadasd", "1234", "ádadas","adadasd","ưdasd");
        QuanLy ql = new QuanLy();
        ql.themDacSan();
        System.out.println(
                ql.getListDacSan()
        );
        ql.suaDacSan(new DacSan(1,"hello","1000","khong","viet nam","ok"));
//        ArrayList<DacSan> listDacSan = new ArrayList<DacSan>();
        System.out.println(
                ql.getListDacSan()
        );
        ql.xoaDacSan(1);
        System.out.println(ql.getListDacSan());
        ql.timDacSan(2);
    }
}
