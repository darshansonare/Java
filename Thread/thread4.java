public class thread4 extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        thread4 t1 = new thread4();
        thread4 t2 = new thread4();
        thread4 t3 = new thread4();

        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
        }
        ;

        t2.start();
        t3.start();
    }
}
