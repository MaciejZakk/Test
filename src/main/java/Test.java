import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("hih", "heh", "meh");

        for (String string : strings) {
            if (string.equals("heh")) {
                System.out.println("lolek");
            } else {
                System.out.println(string);
            }
        }
    }
}
