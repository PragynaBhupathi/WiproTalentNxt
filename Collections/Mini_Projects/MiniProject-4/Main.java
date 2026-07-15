import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();

        Map<String, ArrayList<Card>> map = new TreeMap<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");

            String symbol = sc.next();
            int number = sc.nextInt();

            Card card = new Card(symbol, number);

            if (!map.containsKey(symbol)) {
                map.put(symbol, new ArrayList<Card>());
            }

            map.get(symbol).add(card);
        }

        System.out.println("Distinct Symbols are :");

        for (String symbol : map.keySet()) {
            System.out.print(symbol + " ");
        }

        System.out.println();

        for (String symbol : map.keySet()) {

            System.out.println("Cards in " + symbol + " Symbol");

            int sum = 0;

            for (Card c : map.get(symbol)) {
                System.out.println(c);
                sum += c.getNumber();
            }

            System.out.println("Number of cards : " + map.get(symbol).size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}