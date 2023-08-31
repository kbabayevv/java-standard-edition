package dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task11 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2023, 9, 1);

        LocalDate nextFriday = currentDate;
        while (nextFriday.getDayOfWeek() != DayOfWeek.FRIDAY) {
            nextFriday = nextFriday.plusDays(1);
        }

        LocalDate previousFriday = currentDate;
        if (previousFriday.getDayOfWeek() == DayOfWeek.FRIDAY) {
            previousFriday = previousFriday.minusDays(7);
        } else {
            while (previousFriday.getDayOfWeek() != DayOfWeek.FRIDAY) {
                previousFriday = previousFriday.minusDays(1);
            }
        }

        System.out.println("Current Date: " + currentDate);
        System.out.println("Next Friday: " + nextFriday);
        System.out.println("Previous Friday: " + previousFriday);
    }
}
