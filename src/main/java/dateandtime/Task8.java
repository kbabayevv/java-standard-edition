package dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task8 {
    public static void main(String[] args) {
        String dateString = "2023-08-31";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        LocalDate date = LocalDate.parse(dateString);
        System.out.println(formatter.format(date));
    }
}
