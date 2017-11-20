import java.util.Scanner;

public class MethodDemo {
    // public dataType methodName([parameters]) {}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        double userInt = scan.nextDouble();

        if(isNegative(userInt)) {
            System.out.println("Your number is negative");
        } else if(isPositive(userInt)){
            System.out.println("Your number is positive");
        } else {
            System.out.println("your number is neither negative nor positive");
        }
    }

    public static double tipAmount(double billTotal, int percentageTip) {
        double tipAmount = billTotal * ((double) percentageTip / 100);
        return tipAmount;
    }

    // write a method that takes in an integer and returns a boolean if the integer is negative
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // write an isNegative that takes in a double and returns a boolean if the double is negative or not
    public static boolean isNegative(double number) {
        return number < 0;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }

    public static String sayHello(String name) {
        return "Hello " + name;
    }

    public static void sayHi() {
        System.out.println("Hi");
    }

    public static void saysHelloToPerson(String name) {
        System.out.println("Hello");
    }


}
