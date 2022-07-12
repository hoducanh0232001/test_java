public class test {
    public static void main(String[] args) {
        int n = 18;
        if(n % 2 != 0){
            System.out.println("Weird");
        }
        else if(n % 2 ==0){
            if(n >= 2 && n <= 5){
                System.out.println("Not Weird");
            }
            if(n > 6 && n < 20){
                System.out.println(" Weird");
        }
            if(n >= 20) {
                System.out.println("Not Weird");
            }
        }
    }

}

