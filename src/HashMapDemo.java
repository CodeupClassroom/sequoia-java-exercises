import java.util.HashMap;

/**
 * @author Ryan Orsinger on 11/30/17.
 */
public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Person> instructors = new HashMap<>();

        Person fer = new Person("Fernando");
        Person zach = new Person("Zach");
        Person justin = new Person("Justin");
        Person luis = new Person("Luis");
        Person ryan = new Person("Ryan");

        instructors.put("SequoiaMorning", justin);
        instructors.put("SequoiaAfternoon", ryan);
        instructors.put("RedwoodMorning", luis);
        instructors.put("RedwoodAfternoon", fer);

        instructors.get("RedwoodAfternoon");


        HashMap<String, Person> cityLeadership = new HashMap<>();

        cityLeadership.put("Mayor", new Person("Ron"));
        cityLeadership.put("Police Chief", new Person("McManus"));
        cityLeadership.put("City Councilperson for District 9", new Person("Beto"));

        // after elections
        cityLeadership.put("Mayor", new Person("Bob"));
        cityLeadership.put("City Councilperson for District 9", new Person("Jane"));

        System.out.println("Who's the mayor this year?");
        System.out.println(cityLeadership.get("Mayor"));



    }
}
