public class HelloWorld {

    /* My awesome main method (entry point to the application) */
    public static void main(String[] args) {
        // declare the integer variable.
        int myFavoriteNumber;

        // initialize (assign the variable a value for the first time
        myFavoriteNumber = 23;

        // reassign the variable to hold a new value of the same data type.
        myFavoriteNumber = 42;

        System.out.println("My favorite number is: " + myFavoriteNumber);

        String myString = "Terrific!";
        System.out.println("My favorite string is " + myString);

        // we can't assign chars to a string variable
        // myString = 'c';

        // can't assign doubles to a string variable
        // myString = 3.141;

        float myNumber;
//        we need to initialize (assign a value for the first time)
//        a variable a value before we do anything.
//        System.out.println(myNumber);

        myNumber = 123L;
        System.out.println(myNumber);

        myNumber = 123;
        System.out.println(myNumber);

        int x = 5;
        // x++ is post-incrementing x
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        // ++y is pre-incrementing
        System.out.println(++y);
        System.out.println(y);

        x = 4;
        // newValueForVariable = oldValueForVariable + 5;
        x += 5;

        x = 3;
        y = 4;
        // newValueForOldVarName = OldValueForOldVarName * x;
        y *= x;

        x = 10;
        y = 2;
        x /= y;
        y -= x;



    }

}
