import java.util.Scanner;

public class ControlFlowDemo {
    public static void main(String[] args) {

        System.out.println("Let's make a loop!");

        Scanner scan = new Scanner(System.in);

        System.out.print("What is your starting number?");

        int start = scan.nextInt();

        System.out.print("What is your ending number?");

        int end = scan.nextInt();

        int incrementer;

        do {
            // run the code inside the do body at least ONCE
            System.out.print("Enter an integer greater than 0 to count by");
            incrementer = scan.nextInt();
        } while(incrementer <= 0);

        if(start < end) {
            // for(starting number; condition to enter the loop; incrementer)
            for(int i = start; i <= end; i += incrementer) {
                System.out.println(i);
            }
        } else {
            for(int i = start; i >= end; i -= incrementer) {
                System.out.println(i);
            }

        }


    }
}
