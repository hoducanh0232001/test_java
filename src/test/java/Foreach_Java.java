public class Foreach_Java {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};

        int max = a[0];
        for (int n:a) { // duyệt từng phẩn tử trong a với biến đếm n tương đương for(int i =0 ; i <= a.length(); i++)
            System.out.println(n);
            if (max < n){
                max = n;
            }
        }
        System.out.println("Phần tử lớn nhất là: "+max);
    }
}
