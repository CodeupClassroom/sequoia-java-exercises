package oopExamples;

public class Pug {

    public static int numberOfPugs = 300000;

    public String name;
    public String age;
    public boolean isCute;

    public void grunt(String gruntSound) {
        System.out.println(gruntSound);
    }

    public static void groom() {
        System.out.println("Grooming the pug");
    }

    // slide 9

//        public Pug (String name, String age, boolean isCute) {
//            this.name = name;
//            this.age = age;
//            this.isCute = isCute;
//        }

    // slide 10

        // change visibility of all instance fields to private

        // control + enter to have IntelliJ make getters and setters

}
