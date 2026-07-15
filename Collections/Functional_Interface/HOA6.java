import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
public class HOA6 {
	   public static void main(String[] args) {
	        ArrayList<String> words = new ArrayList<>(Arrays.asList(
	                "Rose", "Lily", "Jasmine", "Lotus", "Tulip",
	                "Orchid", "Daisy", "Marigold", "Sunflower", "Hibiscus"));
	        System.out.println("Original ArrayList:");
	        System.out.println(words);
	        Consumer<ArrayList<String>> c = list -> {
	            for (int i = 0; i < list.size(); i++){
	                String rev = new StringBuilder(list.get(i)).reverse().toString();
	                list.set(i, rev);
	            }
	        };
	        c.accept(words);
	        System.out.println("\nUpdated ArrayList:");
	        words.forEach(System.out::println);
	    }
}