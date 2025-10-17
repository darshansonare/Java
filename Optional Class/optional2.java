import java.util.Optional;

public class optional2 {
    public static void main(String[] args) {
        String[] str = new String[5];
        str[2] = "Geeks for Geeks";

        Optional<String> emp = Optional.empty();
        System.out.println(emp);

        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);

    }
}
