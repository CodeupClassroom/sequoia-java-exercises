import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Please enter an integer: ");
//        int userInt = sc.nextInt();
//        System.out.println(userInt);
//
//        sc.nextLine(); // enables to skip \n
//
//        System.out.println("Please enter three words");
//
//        String firstWord, secondWord, thirdWord;
//
//
//        firstWord = sc.nextLine();
//        secondWord = sc.nextLine();
//        thirdWord = sc.nextLine();
//
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);

        // next() won't capture the whole sentence
//        System.out.println("Enter a sentence");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);


        // codeup room problem

        System.out.print("Please enter the room length: ");
        String lengthString = sc.nextLine();
        double length = Double.parseDouble(lengthString);

        System.out.print("Please enter the room width: ");
        String widthString = sc.nextLine();
        double width = Double.parseDouble(widthString);


        double area = width * length;
        double perimeter = width * 2 + length * 2;

        System.out.printf("%.2f = %.2f x %.2f\n", area, length, width);
        System.out.printf("%.2f = 2 x %.2f + 2 x %.2f\n", perimeter, length, width);






//        System.out.println(length);



    }

}
