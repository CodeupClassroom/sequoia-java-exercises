package util;

/**
 * Created by moon on 11/27/17.
 */
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Please input an integer");
        int someInt = input.getInt();
        System.out.println(someInt);

        int someIntBetween = input.getInt(1, 100);
        System.out.println(someIntBetween);


        System.out.println("Please input a double");
        double someDouble = input.getDouble();
        System.out.println(someDouble);

        double anotherDouble = input.getDouble(1.0, 20.0);
        System.out.println(anotherDouble);

        System.out.println("Please input yes or a no");

        if(input.yesNo()) {
            System.out.println("You input yes or 'y'");
        } else {
            System.out.println("You said anything other than yes.");
        }

        String someString = input.getString();
        System.out.println("You provided: " + someString);
    }
}
