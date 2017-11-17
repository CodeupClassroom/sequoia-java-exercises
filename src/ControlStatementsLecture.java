public class ControlStatementsLecture {

    public static void main(String[] args) {

        if (3 > 3) {
            System.out.println("This is true");
        }


        // ==================== Slide 3

            // no >== ,or <==, or === because only value comparisons are available
            // truthy and falsy values don't exist in Java


        // ==================== Slide 5

            // && will only check second value if first is true
            // & will check both
            // this can be used to check what would otherwise result in a syntax error
            // same comparison process for || and |

            // x will only increment in second condition if first condition is true using &&
//                int x = 2;
//                int y = 3;
//
//                if (false && ++x == y) {
//                    System.out.println("Equal");
//                } else {
//                    System.out.println("Not equal");;
//                }
//                System.out.println(x);


        // ==================== Slide 7

            // DO NOT COMPARE STRINGS WITH == !!!!

            // do use equals(),

//                String test = "test";
//                String toast = "test";
//                boolean stringCompare = test.equals(toast);
//                System.out.println(stringCompare);
//

            // or use equalsIgnoreCase()

//                String hello = "hello";
//                System.out.println(hello.equalsIgnoreCase("HeLlO"));

            // does not equal

//                String tech = "tech";
//                System.out.println(!tech.equalsIgnoreCase("tool"));



            // ==================== Slides 8 - 16

            // basically the same as JS :)


            String caseSwitch = "Fred";
            switch (caseSwitch) {
                case "bob":
                    System.out.println("Case 1");
                    break;
                case "fred":
                    System.out.println("Case 2");
                    break;
                default :
                    System.out.println("Default case");
                    break;
            }




    }

}
