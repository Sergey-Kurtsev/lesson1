package WeekEnum;

public enum WeekEnum {
    MONDAY("WEEKDAY"),
    TUESDAY("WEEKDAY"),
    WEDNESDAY("WEEKDAY"),
    THURSDAY("WEEKDAY"),
    FRIDAY("WEEKDAY"),
    SATURDAY("WEEKEND"),
    SUNDAY("WEEKEND");
    String weekdayOrWeekend;

    WeekEnum(String weekdayOrWeekend) {
        this.weekdayOrWeekend = weekdayOrWeekend;
    }

    public String getWeekdayOrWeekend() {
        return weekdayOrWeekend;
    }
}
