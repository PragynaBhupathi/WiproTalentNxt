import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
public class HOA2 {
	  public static void main(String[] args) {
	        LocalDate today = LocalDate.now();
	        LocalDate firstDayNextMonth = today.plusMonths(1).withDayOfMonth(1);
	        LocalDate firstSunday = firstDayNextMonth.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
	        LocalDate secondSunday = firstSunday.plusWeeks(1);
	        System.out.println("Today's Date        : " + today);
	        System.out.println("Second Sunday of Next Month: " + secondSunday);
	    }
}