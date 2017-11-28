package shapes;

import util.Input;

/**
 * Created by moon on 11/27/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Let's create a circle!");

        System.out.println("Please provide a radius for your circle");
        double radius = Input.getInt();

        Circle myCircle = new Circle(radius);

        System.out.println("Here's the area: " + myCircle.getArea());

        System.out.println("Here's the circumference: " + myCircle.getCircumference());
    }
}
