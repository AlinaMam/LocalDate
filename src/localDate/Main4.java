package localDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main4 {
    public static void main(String[] args) {
        LocalDate newYear2001 = LocalDate.of(2001, 1, 1);
        LocalDate newYear2005 = newYear2001.plusYears(4);
        LocalDate march2001 = newYear2001.plusMonths(2);
        LocalDate january12Year2001 = newYear2001.plusDays(14);
        LocalDate lastWeekJanuary2001 = newYear2001.plus(5, ChronoUnit.YEARS);

        //аналогично с minus

        System.out.println("newYear2005 " + newYear2005);
        System.out.println("march2001 " + march2001);
        System.out.println("january12Year2001 " + january12Year2001);
        System.out.println("lastWeekJanuary20011 " + lastWeekJanuary2001);

    }
}
