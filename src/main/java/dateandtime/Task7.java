package dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("Current Date: " + formatter.format(date));
        date = date.plusWeeks(2);
        System.out.println("Date after 2 weeks: " + formatter.format(date));
    }
}
