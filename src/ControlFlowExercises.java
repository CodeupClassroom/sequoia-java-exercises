import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//                Loop Basics
//
//        ======================================================= While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is
//        less than or equal to 15. Each loop iteration,
//        output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//            int i = 5;
//            while(i <= 15) {
//                System.out.print(i);
//                System.out.print(" ");
//                i += 1;
//            }



//        ======================================================= Do While
//
//        Create a do-while loop that will count by 2's starting with 0
//        and ending at 100. Follow each number with a new line.

//            int i = 0;
//            do {
//                System.out.println(i);
//                i += 2;
//            } while(i <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.

//            int i = 100;
//            do {
//                System.out.println(i);
//                i -= 5;
//            } while(i >= -10);

//        Create a do-while loop that starts at 2, and displays the number
//        squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536


//            long i = 2;
//
//            do {
//                System.out.println(i);
//                i *= i;
//            } while(i < 1000000);


//        ======================================================= For

//        refactor the previous two exercises to use a for loop instead

//        Alter your loop to count backwards by 5's from 100 to -10.

//            for (int i = 100; i >= -10; i -= 5) {
//                System.out.println(i);
//            }


//        Create a do-while loop that starts at 2, and displays the number
//        squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

//            for (long i = 2; i < 1000000; i *= i) {
//                System.out.println(i);
//            }




//        ======================================================= Fizzbuzz
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.

//    for (int i = 1; i <= 100; i += 1) {
//        if (i % 3 == 0 && i % 5 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (i % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (i % 5 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println(i);
//        }
//    }

//        ======================================================= Display a table of powers.
//
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

//            Scanner sc = new Scanner(System.in);
//            boolean willContinue = true;
//
//            do {
//                System.out.print("What number would you like to go up to? ");
//                int userInt = sc.nextInt();
//
//                System.out.println("\nHere is your table!");
//                System.out.println("\nnumber | squared | cubed");
//                System.out.println("------ | ------- | -----");
//
//                for (int i = 1; i <= userInt; i += 1) {
//                    String output = "";
//                    output += String.format("%-7d", i);
//                    output += String.format("|%-9d", i * i);
//                    output += String.format("|%d", i * i * i);
//                    System.out.println(output);
//                }
//
//                System.out.print("\nDo you wish to continue? [y/n]");
//                String userChoice = sc.next();
//                if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
//                    willContinue = true;
//                } else {
//                    willContinue = false;
//                }
//
//            } while (willContinue);





//        ======================================================= Convert given number grades into letter grades.
//
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

//            Scanner sc = new Scanner(System.in);
//            String userChoice;
//
//            do {
//
//                System.out.print("Please enter a numeric grade: ");
//                int gradeEntered = sc.nextInt();
//                char letterGrade = ' ';
//
//                if (gradeEntered >= 88) {
//                    letterGrade = 'A';
//                } else if (gradeEntered >= 80) {
//                    letterGrade = 'B';
//                } else if (gradeEntered >= 67) {
//                    letterGrade = 'C';
//                } else if (gradeEntered >= 60) {
//                    letterGrade = 'D';
//                } else if (gradeEntered >= 0) {
//                    letterGrade = 'F';
//                }
//
//                System.out.println(letterGrade);
//
//                System.out.println("\nDo you wish to continue? [y/n] ");
//                userChoice = sc.next();
//
//            } while(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));




    }

}
