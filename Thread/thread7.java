public class thread7 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            //yield method give chance to run another thread 
            //in this code we get output
            // Thread-1: 1
            // Thread-0: 1
            // Thread-1: 2
            // Thread-0: 2
            // Thread-1: 3
            // Thread-0: 3
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        thread7 t1 = new thread7();
        thread7 t2 = new thread7();

        t1.start();
        System.out.println(t1.isAlive());
        t2.start();
    }
}
