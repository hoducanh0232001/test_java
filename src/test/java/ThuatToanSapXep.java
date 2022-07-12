public class ThuatToanSapXep {
    public static void sapXep(int arr[]){
        int temp = arr[0];
        for(int i =0; i < arr.length -1; i++){
            for(int j = i+1;j< arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []a = {0,5,6,3,1,2,4,9,8};
        sapXep(a);
        for (int i =0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
