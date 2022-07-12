package QuanLyDacSan;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<DacSan> listDacSan  = new ArrayList<DacSan>();
    public ArrayList<DacSan> getListDacSan() {
        return listDacSan;
    }

    public void setListDacSan(ArrayList<DacSan> listDacSan) {
        this.listDacSan = listDacSan;
    }

    public QuanLy(){
    }

    public void themDacSan(){
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i<2 ; i++){
            // đọc từ terminal từ máy
            System.out.println("Nhập id: ");
            int mId = sc.nextInt();
            System.out.println("Nhập tên đặc sản: ");
            String mName = sc.next();
            System.out.println("Nhập giá: ");
            String mPrice = sc.next();
            System.out.println("Nhập mô tả: ");
            String mDescription = sc.next();
            System.out.println("Nhập địa điểm: ");
            String mLocation = sc.next();
            System.out.println("Nhập ghi chú: ");
            String mNote = sc.next();
            listDacSan.add(new DacSan(mId,mName,mPrice,mDescription,mLocation,mNote));
        }

    }
    public void suaDacSan(DacSan ds){
        for(int i =0; i< listDacSan.size(); i++){

        if(listDacSan.get(i).getId()== ds.getId()){
                listDacSan.remove(i);
                listDacSan.add(ds);
            }
        }
    }
    public void xoaDacSan(int ds){
        for(int i =0; i< listDacSan.size() ; i++){

            if(listDacSan.get(i).getId()== ds){
                listDacSan.remove(i);
            }
        }
    }
    public void timDacSan(int ds){
        for(int i =0; i< listDacSan.size() ; i++){

            if(listDacSan.get(i).getId()== ds){
                System.out.println(listDacSan.get(i));
            }
        }
    }
}
