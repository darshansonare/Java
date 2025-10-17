import java.util.function.Supplier;

public class Supplierr {
    public static void main(String[] args) {
        Supplier<String> st = () -> "Supplier didn't get any argument";
        System.out.println(st.get());
    }
}
