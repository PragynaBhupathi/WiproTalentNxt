import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
public class HOA3 {
	 public static void main(String[] args) {
	        ArrayList<String> words = new ArrayList<>(Arrays.asList(
	                "madam", "level", "apple", "radar", "java",
	                "malayalam", "racecar", "banana", "civic", "hello"));
	        Predicate<String> p = str -> {
	            String rev = new StringBuilder(str).reverse().toString();
	            return str.equalsIgnoreCase(rev);
	        };
	        System.out.println("Palindrome Words:");
	        for (String word : words) {
	            if (p.test(word)) {
	                System.out.println(word);
	            }
	        }
	    }
}