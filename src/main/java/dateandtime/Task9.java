package dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task9 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();//dd Month yyyy Time->HH:mm:ss
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");
        StringBuilder sb = new StringBuilder(formatter.format(dateTime));
        sb.insert(15, "Time->");
        System.out.println(sb);
    }
}
