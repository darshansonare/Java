import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class execuframework4 {
    public static void main(String[] args) {
        //two thread will execute at a one time
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);

        Runnable task = () -> System.out.println("Executed At: " + System.currentTimeMillis());
        //delay for 2 second
        service.schedule(task, 2, TimeUnit.SECONDS);

        //delay when 1 thread execute after three second
        service.scheduleAtFixedRate(task, 1, 3, TimeUnit.SECONDS);
    }
}
