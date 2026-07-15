import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
public class HOA2 {
	 public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>(
	                Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 99, 100));
	        Function<ArrayList<Integer>, Integer> f = l -> {
	            int sum = 0;
	            for (int n : l) {
	                sum += n;
	            }
	            return sum;
	        };
	        int result = f.apply(list);
	        System.out.println("ArrayList : " + list);
	        System.out.println("Sum = " + result);
	    }
}