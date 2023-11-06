package localDate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Main1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int year = today.get(ChronoField.YEAR);
        int month = today.get(ChronoField.MONTH_OF_YEAR);
        int dayYear = today.get(ChronoField.DAY_OF_YEAR);
        int dayMonth = today.get(ChronoField.DAY_OF_MONTH);
        int dayWeek = today.get(ChronoField.DAY_OF_WEEK);
        System.out.println("year " + year);
        System.out.println("month " + month);
        System.out.println("dayYear " + dayYear);
        System.out.println("dayMonth " + dayMonth);
        System.out.println("dayWeek " + dayWeek);
    }
}
