import java.time.LocalDate;
public class HOA4 {
	public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        if (today.isLeapYear()){
            System.out.println(year + " is a Leap Year");
        } else{
            System.out.println(year + " is Not a Leap Year");
        }
    }
}