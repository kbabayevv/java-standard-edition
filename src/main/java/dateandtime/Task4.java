package dateandtime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Task4 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now(ZoneId.of("America/New_York"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(formatter.format(time));
    }
}
