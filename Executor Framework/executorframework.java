import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class executorframework implements Runnable{


    public void run(){
        System.out.println(Thread.currentThread().getName() + " Threading......");
    }

    public static void main(String[] args) {
        //create a single thread means one by one thread will execute
        
        Executor executor = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 3; i++) {
            executor.execute(new executorframework());
            try{
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            ;
        }
    }
}