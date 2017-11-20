public class StringExercise {
    public static void main(String[] args) {
        String message;

        // exercise 1
        //    We don't need no education
        //    We don't need no thought control
        message = "We don't need no education\n"
        + "We don't need no thought control"
        + "\n ------ \n"

        // exercise 2
        // Check "this" out!, "s inside of "s!
        + "Check \"this\" out!, \"s inside of \"s!"
        + "\n ------ \n"

        // Exercise 3
        // In windows, the main drive is usually C:\
        + "In windows, the main drive is usually C:\\"
        + "\n ------ \n"

        // exercise 4
        //    I can do backslashes \, double backslashes \\,
        //    and the amazing triple backslash \\\!
        + "I can do backslashes \\, double " + "\\" + "\\" + ",\n"
        + "and the amazing triple backslash \\\\\\!";

        System.out.println(message);
    }
}