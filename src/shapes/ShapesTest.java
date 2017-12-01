package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(5, 10);
        System.out.println("My rectangle's area is " + myShape.getArea());
        System.out.println("My rectangle's perimeter is " + myShape.getPerimeter());

        myShape = new Rectangle(8, 3);
        System.out.println("The second rectangle's area is " + myShape.getArea());
        System.out.println("The second rectangle's perimeter is " + myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println("The square's area is " + myShape.getArea());
        System.out.println("The square's perimeter is " + myShape.getPerimeter());
    }
}
