import org.jetbrains.annotations.Contract;

/**
 * @author Ryan Orsinger on 12/1/17.
 */
public class AnnotationDemo {

    @Deprecated
    public static int getRandomInt(int max) {
        return (int) Math.floor(Math.random() * max);
    }

    public static void main(String[] args) {
        System.out.println(getRandomInt(10));
        System.out.println(getRandomInt(10));
    }
}
