public class thread6 extends Thread {
    public void run() {
        System.out.println("Thread is running..........");
    }

    public static void main(String[] args) {
        thread6 t1 = new thread6();

        System.out.println("State Before Execute Thread:" + t1.getState());
        t1.start();
        System.out.println("State After Execute Thread: "+ t1.getState());
    }
}
