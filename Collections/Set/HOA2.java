import java.util.HashSet;
import java.util.Iterator;

public class HOA2 {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Rupa");
        employees.add("Ammuu");
        employees.add("Ramya");
        employees.add("Karthik");

        Iterator<String> itr = employees.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}