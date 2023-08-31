package dateandtime;

import java.time.LocalDate;

public class Task5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int lastDay = date.lengthOfMonth();
        System.out.println("Last day of " + date.getMonth() + " = " + lastDay);

    }
}
