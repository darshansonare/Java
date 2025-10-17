import java.util.function.Function;

public class Functionn {
    public static void main(String[] args) {
        Function<Integer, Integer> fr = n -> n * n;
        System.out.println(fr.apply(10));
    }
}
