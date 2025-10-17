import java.util.Optional;

public class optional3 {
    public static void main(String[] args) {
        String name = "Darshan";

        Optional of = Optional.ofNullable(name);

        if (of.isPresent()) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }
    }
}
