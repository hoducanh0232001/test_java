import java.util.Scanner;

public class ScannerClass {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nationality: ");
        String nationality = scanner.nextLine();
       // System.out.println("quốc tịch là : " + nationality);
        System.out.println("How old are you ?");
        int age = scanner.nextInt();
       // System.out.println("Tuổi: "+ age);
        System.out.format("Welcome %s - %d year old ",nationality,age);
        System.out.println("\nPi:  " );
        float pi = scanner.nextFloat();
        System.out.println("Pi là : " + pi);
        scanner.close();
    }
}
