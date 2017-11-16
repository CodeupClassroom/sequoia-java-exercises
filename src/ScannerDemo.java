import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        String userInput;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. Please input your name!");
        userInput = scan.nextLine();

        System.out.println("Hi, " + userInput + "! It's nice to meet you. My name is RoboName");
        System.out.println("What is your favorite number?");
        int userNumber = scan.nextInt();
        System.out.println("You told me that your favorite number is " + userNumber);

    }
}
