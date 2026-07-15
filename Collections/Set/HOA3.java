import java.util.Iterator;
import java.util.TreeSet;

public class HOA3 {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("India");
        ts.add("USA");
        ts.add("Japan");
        ts.add("Australia");

        System.out.println("Reverse Order:");
        System.out.println(ts.descendingSet());

        System.out.println("\nUsing Iterator:");

        Iterator<String> itr = ts.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nCheck Element:");

        if (ts.contains("India")) {
            System.out.println("India Found");
        } else {
            System.out.println("India Not Found");
        }
    }
}