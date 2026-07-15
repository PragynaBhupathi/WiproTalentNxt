import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class HOA1 {
	public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10, -2, 15, -8, 20, -17, -24, 35, -40, 50, -11, -6));
        System.out.println("Original ArrayList:");
        System.out.println(al);
        List<Integer> result = al.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("\nNegative Even Numbers:");
        result.forEach(System.out::println);
    }
}