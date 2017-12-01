import java.util.ArrayList;
import shapes.*;

/**
 * @author Ryan Orsinger on 11/30/17.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<>();

        doubles.add(1.1);
        doubles.add(2.2);
        doubles.add(3.3);
        doubles.add(4.4);

        doubles.remove(2);
        System.out.println(doubles.get(2));

        System.out.println(doubles.indexOf(3.141593));

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Bob"));
        people.add(new Person("Jane"));

        people.set(0, new Person("Margaret"));

        // for(DatatypeOfEachElementInTheArray variableNameWeCallEachElement : variableNameThatsTheArray)

        for(Person person : people) {
            System.out.println(person.getName());
        }

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("toyota", "mr2"));
        cars.add(new Car("volkswagen", "bug"));

        ArrayList<Quadrilateral> shapes = new ArrayList<>();
        shapes.add(new Square(5));
        shapes.add(new Rectangle(10, 15));
        shapes.add(new Square(2));

    }
}
