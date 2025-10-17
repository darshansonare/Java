import java.util.function.Consumer;

public class Consumerr {
    public static void main(String[] args) {
        Consumer<String> st = s -> System.out.println("Message:" + s);
        st.accept("Darshan");
    }
}
