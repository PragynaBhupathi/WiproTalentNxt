import java.time.LocalDate;
import java.time.Period;
public class HOA3 {
	   public static void main(String[] args) {
	        LocalDate joiningDate = LocalDate.of(2024, 7, 15);
	        LocalDate today = LocalDate.now();
	        Period experience = Period.between(joiningDate, today);
	        System.out.println("Joining Date : " + joiningDate);
	        System.out.println("Today's Date : " + today);
	        System.out.println("Experience :"+ experience.getYears() + " Years,"+ experience.getMonths() + " Months, "+ experience.getDays() + " Days");
	    }
}