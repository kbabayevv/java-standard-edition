package dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task6 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 8, 1);
        for (int i = 0; i <= date.lengthOfMonth(); i++) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println(date.getDayOfMonth());
            }
            date = date.plusDays(1);
        }
    }
}
