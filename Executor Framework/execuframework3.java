import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class execuframework3 {
    public static void main(String[] args) {
        //Creates new threads as needed, can scale dynamically, and reuses idle threads.
        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 1; i <= 6; i++) {
            int target=i;
            System.out.println(Thread.currentThread().getName() + ": " + i);
            
            try{
                Thread.sleep(1000);
            } catch (Exception e) {};
        }

    }
}
