/**
 * Created by moon on 11/27/17.
 */
public class PersonApp {
    public static void main(String[] args) {

        Person person1 = new Person("Jane");
        Person person2 = new Person("Jane");

        // next line is true b/c the strings are the same
        System.out.println(person1.getName().equals(person2.getName()));

        // next line is false b/c each object has a separate reference in memory.
        // they are separate objects.
        System.out.println(person1 == person2);

        Person person3 = new Person("Bob");
        Person person4 = person3;
        // The next line is true b/c person4 = person3 is assigning the reference.
        // that means that both person3 and person4 reference the same location in memory
        System.out.println(person3 == person4);

        // b/c objects assign a reference to a variable, not a value.
        Person person5 = new Person("John");
        Person person6 = person1;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());
    }
}
