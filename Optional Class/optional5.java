import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class optional5 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Darshan");
        list1.add("Pankaj");
        list1.add("Rakesh");
        list1.add("Gunjan");
        list1.add("Dutvik");

        Optional<String> list3 = list1.stream().filter(name -> name.startsWith("D")).findFirst();
        System.out.println(list3);

        
        
    }
}
