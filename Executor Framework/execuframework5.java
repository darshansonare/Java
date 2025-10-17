import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class execuframework5 implements Runnable {
    private String filename;

    execuframework5(String filename) {
        this.filename = filename;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "Starting Downloading: " + filename);

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
        ;

        System.out.println(Thread.currentThread().getName() + "Finished Downloading: " + filename);

    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        String[] files = { "file1.zip", "file2.mp4", "file3.pdf", "file4.jpg", "file5.mp3" };

        for (String file : files) {
            service.execute(new execuframework5(file));
        }
        
        service.shutdown();

        try{
            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                service.shutdownNow();
            }
        } catch (Exception e) {
            service.shutdownNow();
        }

        System.out.println("All downloads completed");
    }
}
