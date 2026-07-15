import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
public class HOA7 {
	 public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
	                12, 25, 36, 47, 58, 63, 70, 81, 99, 15));
	        Consumer<Integer> c = n -> {
	            if (n % 2 == 0)
	                System.out.println(n + " even");
	            else
	                System.out.println(n + " odd");
	        };
	        numbers.forEach(c);
	    }
}