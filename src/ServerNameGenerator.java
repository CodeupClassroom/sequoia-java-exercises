/**
 * ServerNameGenerator generates random server names
 * Exercise 1 of http://java.codeup.com/java-ii/arrays/
 */
public class ServerNameGenerator {
    public static String getRandomString(String[] strings) {
        int randomIndex = (int) (Math.random() * strings.length);
        return strings[randomIndex];
    }

    public static void main(String[] args) {

        String[] nouns = {"car", "duck", "phone", "lobster", "rock", "lute", "railroad", "editor", "specter", "platform"};

        String[] adjectives = {"wild", "funky", "thoughtful", "obtuse", "acute", "hazy", "random", "fanciful", "peaceful", "international"};

        String serverName = getRandomString(adjectives) + " " + getRandomString(nouns);

        System.out.println("Your server name is: " + serverName);

    }

}
