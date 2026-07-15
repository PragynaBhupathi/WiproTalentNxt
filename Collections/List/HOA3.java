import java.util.ArrayList;
import java.util.Iterator;

public class HOA3 {

    public static void printAll(ArrayList<String> list) {

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");

        printAll(list);
    }
}