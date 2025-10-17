public class thread3 extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + "- " + i);
            
            try{
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        thread3 t1 = new thread3();
        thread3 t2 = new thread3();

        t1.start();
        t2.start();
    }
}
