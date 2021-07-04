package WeekEnum;

public class Program {
    public static void main(String[] args) {
        int i = 0;
        WeekEnum[] types = WeekEnum.values();
        for (WeekEnum s : types) {

            System.out.println(s + " - " + types[i].getWeekdayOrWeekend());
            i++;
        }
    }
}
