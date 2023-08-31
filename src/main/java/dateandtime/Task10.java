package dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task10 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMM yyyy HH:mm:ss.SSS");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("MMM yyyy HH:mm:ss");
        System.out.println(formatter1.format(dateTime));
        System.out.println(formatter2.format(dateTime));
        System.out.println(formatter3.format(dateTime));
        System.out.println(formatter4.format(dateTime));
    }

}

