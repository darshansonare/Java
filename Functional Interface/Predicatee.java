
import java.util.function.Predicate;

public class Predicatee {
    public static void main(String[] args) {
        Predicate<Integer> pr = n -> n % 2 == 0;
        System.out.println(pr.test(12));
        System.out.println(pr.test(13));


    }
}
