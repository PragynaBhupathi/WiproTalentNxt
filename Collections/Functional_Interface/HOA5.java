import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
public class HOA5 {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 7, 9, 15, 16, 20, 25, 30, 36, 50));
        Predicate<Integer> p = n -> {
            int root = (int) Math.sqrt(n);
            return root * root == n;
        };
        System.out.println("Perfect Square Numbers:");
        for (int num : list){
            if (p.test(num)){
                System.out.println(num);
            }
        }
    }
}