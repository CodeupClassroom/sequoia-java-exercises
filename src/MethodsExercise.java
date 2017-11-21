import java.util.Scanner;

/**
 * Exercise solutions for http://java.codeup.com/java-i/methods/
 */
public class MethodsExercise {
    public static void main(String[] args) {

        int firstNumber = getIntegerBetween(1, 10);

        int secondNumber = getIntegerBetween(1, 10);

        int sum = add(firstNumber, secondNumber);
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);
    }

    public static long factorial(int number) {
        long result = 1;

        for(int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static int getIntegerBetween(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me an Integer between " + min + " and  " + max);
        int userInt = scan.nextInt();

        if(userInt < min || userInt > max) {

            return getIntegerBetween(min, max);
        } else {
            return userInt;
        }
    }


}
