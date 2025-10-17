@FunctionalInterface
interface Sum{
    public int addition(int a, int b);
    
}

public class functional2 {
    public static void main(String[] args) {
        Sum s = (a, b) -> a + b;
        System.out.println(s.addition(3, 42));
    }
}
