package localDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        LocalDate newYear2001 = LocalDate.of(2001, 1, 1);
        System.out.println(newYear2001);

        LocalDate newYear2002 = LocalDate.of(2002, Month.JANUARY, 1);
        System.out.println(newYear2002);

        LocalDate today = LocalDate.now();
        int year = today.getYear();
        Month month = today.getMonth();
        int dayYear = today.getDayOfYear();
        int dayMonth = today.getDayOfMonth();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("День в году: " + dayYear);
        System.out.println("День месяца: " + dayMonth);
        System.out.println("День недели: " + dayOfWeek);
    }
}
