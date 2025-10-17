import java.util.Optional;

public class optional1{
    public static void main(String[] args) {
        String arr[] = new String[10];
        
        Optional<String> opti = Optional.ofNullable(arr[5]);

        if (opti.isPresent()) {
            String word = arr[5].toLowerCase();
            System.out.println(word);
        } else {
            System.out.println("Word is Null");
        }

    }
}