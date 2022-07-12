public class Mang_Java {
    public static void main(String[] args) {
       // mảng 1 chiều
        int []a ;
        int i = 0;
        a = new int [4];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        for(i=0 ;i<a.length; i++) {
            System.out.println(a[i]);
        }
        char[]b;
        b= new char[]{'D', 'U', 'C', 'A', 'N', 'H', 'D', 'E', 'P', 'T', 'R', 'A', 'I'};
        System.out.println(b);

        // mảng đa chiều
        int arr[][] = { {1,7,8},{3,6,1},{5,4,2} };

        for (int x=0; x< 3 ; x++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[x][j] + " ");
            }
                System.out.println();
            }

    }

}
