package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    // declaring
    private ArrayList<Integer> grades;

    // constructor that takes in a name argument and uses it to set the name
    public Student(String name) {
        this.name = name;

        // initializing
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int numberOfGrades = grades.size();
        double sumOfAllGrades = 0;
        double average;

        for(int grade : grades) {
            sumOfAllGrades += grade;
        }

        average = sumOfAllGrades / numberOfGrades;
        return average;
    }

    // Write just enough code in the main method to test the class's methods before using this class elsewhere...
    public static void main(String[] args) {
        System.out.println("Testing the Student class");
        Student student = new Student("Maggie");

        System.out.println("make sure we start with an empty arraylist of grades");
        System.out.println("The number of elements in the grades array is " + student.grades.size());

        System.out.println("Now we'll add 3 grades, a 90, a 95, and an 82");
        student.addGrade(90);
        student.addGrade(95);
        student.addGrade(82);

        double expectedGrade = (90 + 95 + 82) / 3;
        System.out.println("The expected average is " + expectedGrade);
        System.out.println("The average produced by .getAverageGrade is " + student.getGradeAverage());
        System.out.println("Yay! Now we know that .addGrade and .getAverageGrade work!");
        System.out.println("We can use this class in the rest of our application :)");
    }
}
