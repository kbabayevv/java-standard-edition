package enumexercises;

public enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String name;

    DaysOfWeek(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isWeekday() {
        if (getName().equals(SATURDAY.name) || getName().equals(SUNDAY.name)) {
            return false;
        }
        return true;
    }

    public boolean isHoliday() {
        if (getName().equals(SATURDAY.name) || getName().equals(SUNDAY.name)) {
            return true;
        }
        return false;
    }
}
