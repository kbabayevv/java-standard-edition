package dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Task1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        LocalDateTime dateTime = LocalDateTime.of(year, month, day, hour, minute);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy  HH:mm");
        String date = formatter.format(dateTime);
        System.out.println(date);
    }
}
