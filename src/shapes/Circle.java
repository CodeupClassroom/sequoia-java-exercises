package shapes;

/**
 * Created by moon on 11/27/17.
 */
public class Circle {
    private double radius;
    private static int circleCount;

    public Circle(double radius) {
        this.radius = radius;
        Circle.circleCount++;
    }

    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference() {
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }

    public static int getCircleCount() {
        return Circle.circleCount;
    }
}
