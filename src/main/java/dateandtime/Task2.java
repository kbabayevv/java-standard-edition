package dateandtime;

import java.util.Calendar;

public class Task2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int maxYear = calendar.getActualMaximum(Calendar.YEAR);
        int maxMonth = calendar.getActualMaximum(Calendar.MONTH) + 1;
        int maxWeek = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int maxDate = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("Maximum Year: " + maxYear);
        System.out.println("Maximum Month: " + maxMonth);
        System.out.println("Maximum Week: " + maxWeek);
        System.out.println("Maximum Date: " + maxDate);
    }
}
