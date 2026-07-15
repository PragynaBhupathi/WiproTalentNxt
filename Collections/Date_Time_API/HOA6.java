import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class HOA6 {
	public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime beforeTime = currentTime.minusHours(5).minusMinutes(30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Current Time  : " + currentTime.format(formatter));
        System.out.println("Time Before 5 Hours 30 Minutes : " + beforeTime.format(formatter));
    }
}