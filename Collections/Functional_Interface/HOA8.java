import java.util.ArrayList;
import java.util.function.Supplier;
public class HOA8 {
    public static void main(String[] args) {
        Supplier<ArrayList<Integer>> s = () -> {
            ArrayList<Integer> primeList = new ArrayList<>();
            int num = 2;
            while (primeList.size() < 10) {
                boolean prime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    primeList.add(num);
                }
                num++;
            }
            return primeList;
        };
        ArrayList<Integer> primes = s.get();
        System.out.println("First 10 Prime Numbers:");
        System.out.println(primes);
    }
}