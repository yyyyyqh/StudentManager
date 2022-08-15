import java.util.Arrays;

public class stringArrayTest {
    public static void main(String[] args) {
        String a = "213213";
        String[] words = a.split("1");

        System.out.println(Arrays.toString(words));
    }
}
