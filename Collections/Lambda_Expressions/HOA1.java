import java.util.ArrayList;
import java.util.Random;
public class HOA1 {
	 public static void main(String[] args) {
	        ArrayList<Integer> al = new ArrayList<>();
	        Random r = new Random();
	        for (int i = 0; i < 25; i++) {
	            al.add(r.nextInt(100) + 1);
	        }
	        System.out.println("ArrayList:");
	        System.out.println(al);
	        System.out.println("\nPrime Numbers:");
	        al.forEach(num -> {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        });
	    }
	    public static boolean isPrime(int n) {
	        if (n <= 1)
	            return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }
}