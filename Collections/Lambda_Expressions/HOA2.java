import java.util.ArrayList;
import java.util.Collections;
public class HOA2 {
	public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("Banana");
        al.add("Cherry");
        al.add("Mango");
        al.add("Orange");
        al.add("Grapes");
        al.add("Papaya");
        al.add("Guava");
        al.add("Pineapple");
        al.add("Watermelon");
        System.out.println("Original List:");
        al.forEach(word -> System.out.print(word + " "));
        Collections.reverse(al);
        System.out.println("\n\nStrings in Reverse Order:");
        al.forEach(word -> System.out.print(word + " "));
    }
}