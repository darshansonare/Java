interface data{
    void show();
}

public class functional1{
    public static void main(String[] args) {
        data g = () -> System.out.println("Hello Word");
        g.show();
    }
}