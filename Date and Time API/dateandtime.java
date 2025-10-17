import java.time.*;
import java.time.format.DateTimeFormatter;

public class dateandtime {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Time:" + time);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("Date and Time: " + datetime);

        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        String formatedDateTime = current.format(format);
        System.out.println("Formated Manner" + formatedDateTime);

        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int second = current.getSecond();

        System.out.println("Month:" + month + " day:" + day + " second:" + second);
        
        
    }
}