import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class execuframework2{
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 1; i <= 6; i++) {
            int target = i;
            service.execute(() -> {
                System.out.println(Thread.currentThread().getName() + ":" + target);
            });
        }
        service.shutdown();
    
    }
}
