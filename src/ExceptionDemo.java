import java.util.Scanner;

publ    ic class ExceptionDemo {
    public static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();
        if (indentationPreference.equals("tabs")) {
            throw new Exception("Spaces are superior!");
        }
        return indentationPreference;
    }

    public static void main(String[] args) {

        String preference = null;
        try {
            preference = getIndentationPreference();
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Cool, I like " + preference + " too.");

            System.out.println("You monster!");

    }
}

