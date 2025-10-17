public class thread2 extends Thread {
    private String name;

    thread2(String name) {
        this.name = name;
    }
    
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + "- Count: " + i);
        }
    }
    
    public static void main(String[] args) {
        thread2 t1 = new thread2("Thread A");
        thread2 t2 = new thread2("Thread B");

        t1.start();
        t2.start();
    }
}
