interface Data {
    void show();

    default void printsome() {
        System.out.println("Hello this is default method");
    }

    static void staticmethod() {
        System.out.println("Hello this is static method");
    }
}

public class defaultmethod {
    public static void main(String[] args) {
        Data d = () -> System.out.println("Data printed");
        d.show();
        d.printsome();
    
        Data.staticmethod();

    }
}
