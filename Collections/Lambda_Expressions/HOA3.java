import java.util.ArrayList;

public class HOA3 {
	 public static void main(String[] args) {
	        ArrayList<String> al = new ArrayList<>();
	        al.add("Rose");
	        al.add("Lily");
	        al.add("Jasmine");
	        al.add("Lotus");
	        al.add("Tulip");
	        al.add("Sunflower");
	        al.add("Marigold");
	        al.add("Daisy");
	        al.add("Orchid");
	        al.add("Hibiscus");
	        System.out.println("Strings with Odd Length:");
	        al.forEach(word -> {
	            if (word.length() % 2 != 0) {
	                System.out.println(word);
	            }
	        });
	    }
}