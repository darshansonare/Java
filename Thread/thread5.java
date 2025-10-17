public class thread5 extends Thread{
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
    
    public static void main(String[] args) {
        thread5 t1 = new thread5();
        thread5 t2 = new thread5();
        thread5 t3 = new thread5();

      
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t3.setPriority(NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        
    }
}
