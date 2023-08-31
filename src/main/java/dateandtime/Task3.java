package dateandtime;

import java.util.Calendar;

public class Task3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int minYear = calendar.getActualMinimum(Calendar.YEAR);
        int minMonth = calendar.getActualMinimum(Calendar.MONTH) + 1;
        int minWeek = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int minDate = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);

        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + minMonth);
        System.out.println("Minimum Week: " + minWeek);
        System.out.println("Minimum Date: " + minDate);
    }
}
