import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class HOA5 {
	public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime after25Minutes = currentTime.plusMinutes(25);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Current Time           : " + currentTime.format(formatter));
        System.out.println("Time After 25 Minutes  : " + after25Minutes.format(formatter));
    }
}