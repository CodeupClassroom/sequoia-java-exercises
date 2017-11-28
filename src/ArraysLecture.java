public class ArraysLecture {

    public static void main(String[] args) {


        // slide 3 (Arrays)

//            double[] prices; // declare the array variable
//            prices = new double[4]; // create the new array


            // declare array variable and create new array in one line
//            double[] prices = new double[4];

            // using a variable for array size and using an array of objects
//            final int NUMBER_OF_BEATLES = 4;
//            BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES];


        // slide 4 (Elements)

            // setting values at individual indices
//            int[] numbers = new int[3];
//            numbers[0] = 1;
//            numbers[1] = 2;
//            System.out.println(numbers[0]);
//            System.out.println(numbers[2]); // default value

            // initializing values while declaring array with an array literal
//            String[] beatles = {"John", "Paul", "Ringo"};
//            System.out.println(beatles[0]); // "John"
//            System.out.println(beatles[2]); // "Ringo"
//            // beatles[3] = "George"; // ArrayIndexOutOfBoundsException !


        // slide 5 (Iterating)

//            String[] languages = {"html", "css", "javascript", "java"};

            // regular for loop
//            for (int i = 0; i < languages.length; i++) {
//                System.out.println(languages[i]);
//            }

            // enhanced for loop
//            for (String language : languages) {
//                System.out.println(language);
//            }


            // additional enhanced for loop example
//            int[] someNumbers = {1, 2, 3, 4, 5};
//            for (int n : someNumbers) {
//                System.out.println(n);
//            }


        // slide 6 and 7 (The Arrays Class)

//            String[] testArray = new String[4];

            // Arrays.fill(arrayName, value) - fills all or a range of elements with a given value

//                Arrays.fill(testArray, "Badgers");

            // Arrays.toString(arrayName) - prints out a copy of the array contents

//                String arrayAsAString = Arrays.toString(testArray);
//                System.out.println(arrayAsAString);

            // Arrays.equals(array1, array2) - returns true if two array elements are equal and in the same order

//                String[] words = {"Mushroom", "Mushroom"};
//
//                System.out.println(words.equals(testArray));

            // Arrays.copyOf(array, length) - returns a copy array of a given array of a given length

//                String[] twoBadgers = Arrays.copyOf(testArray, 2);
//                System.out.println(Arrays.toString(twoBadgers));


            // Arrays.sort(array, startIndex, toIndex) - sorts array elements alphabetically/numerically 2nd and 3rd arguments are optional.

//            String[] meme = {"Badgers", "Mushroom", "Badgers", "Snake"};
//
//            System.out.println(Arrays.toString(meme));
//            Arrays.sort(meme); // this does change the original
//            System.out.println(Arrays.toString(meme));


            // Arrays.binarySearch(array, value) - returns the index of a value if in the array or -1 if not found
              // Array MUST be sorted before using binarySearch() to return a valid index.

//            String[] meme = {"Badgers", "Mushroom", "Badgers", "Snake"};
//            Arrays.sort(meme);
//
//            System.out.println(Arrays.binarySearch(meme,"fox")); // what???
//            System.out.println(Arrays.binarySearch(meme, "Snake"));


        // slide 8 (Two-Dimensional Arrays)

//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        for (int[] row : matrix) {
//            System.out.println("+---+---+---+");
//            System.out.print("| ");
//            for (int n : row) {
//                System.out.print(n + " | ");
//            }
//            System.out.println();
//        }
//        System.out.println("+---+---+---+");

    }

}
