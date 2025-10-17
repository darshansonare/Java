public class thread1 extends Thread{

    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        t1.start();
        System.out.println("Main Thread: "+ Thread.currentThread().getName());
    }
}