import java.io.*;
public class Testclass {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your name: ");
    String name = reader.readLine();
    System.out.println("Your name is: " + name);
    System.out.println("Enter your age");
    int age = Integer.parseInt(reader.readLine());
    System.out.println("Your age is:" + age);
    }
}

