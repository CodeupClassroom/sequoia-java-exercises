package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle table = new Rectangle(5, 10);
        System.out.println("My rectangle's area is " + table.area());
        System.out.println("My rectangle's perimeter is " + table.perimeter());

        Rectangle door = new Rectangle(8, 3);
        System.out.println("The second rectangle's area is " + door.area());
        System.out.println("The second rectangle's perimeter is " + door.perimeter());

        Rectangle square1 = new Square(5);
        System.out.println("The square's area is " + square1.area());
        System.out.println("The square's perimeter is " + square1.perimeter());
    }
}
