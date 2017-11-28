package shapes;

import util.Input;

/**
 * Created by moon on 11/27/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Let's create a circle!");
        Input input = new Input();

        do {
            double radius = input.getInt("Please provide a radius for your circle");

            Circle myCircle = new Circle(radius);

            System.out.println("Here's the area: " + myCircle.getArea());

            System.out.println("Here's the circumference: " + myCircle.getCircumference());

        } while(input.yesNo("Would you like to make another circle? y/n"));

        int circleCount = Circle.getCircleCount();
        System.out.println("Thanks for using CircleApp™. You created " + circleCount + " circle objects.");
    }
}
