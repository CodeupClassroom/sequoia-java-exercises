package shapes;

/**
 * Created by moon on 11/27/17.
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        double area = Math.PI * (this.radius * this.radius);
    }
    public double getCircumference() {
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }


}
