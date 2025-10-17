import java.util.Optional;

public class optional4 {
    public static void main(String[] args) {
        
        String name = null;
        Optional<String> opt = Optional.ofNullable(null);

        //1st way
        System.out.println(opt.orElse("Default Name"));

        //2nd way
        if (opt.isPresent()) {
            System.out.println("Name is present:"+ opt);
        } else {
            System.out.println("Not Present");
        }
    }
}
