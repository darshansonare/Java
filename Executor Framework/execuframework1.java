import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class execuframework1 implements Runnable {
    private int id;

    execuframework1(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Thread Executed: " + id);
    }
    
    public static void main(String[] args) {
        //three task run parllely when code exexute we have to perfrom iterator 6 time butt thread pool is only 3 size
        //so at a single time 3 thread will execute parllely another thrree are wating state.
        //after three thread execute another will execute..
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            executorService.execute(new execuframework1(i));
        }

        executorService.shutdown();
    }
}
