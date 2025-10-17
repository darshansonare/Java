@FunctionalInterface
interface A {
    void show(String msg);
}

interface B extends A {
    
}


public class functonal3 {
    public static void main(String[] args) {
        B br = msg-> System.out.println("Hello "+ msg);
        br.show("I am Darshan");
    
    }
}
