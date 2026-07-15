import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HOA4 {
	public static void main(String[] args) {
        HashMap<String, Integer> contactList = new HashMap<String, Integer>();
        contactList.put("Rupa", 12345);
        contactList.put("Ammuu", 23456);
        contactList.put("Karthik", 34567);
        contactList.put("Honey", 45678);
        contactList.put("Ramya", 56789);
        if (contactList.containsKey("Ammuu")){
            System.out.println("Key 'Ammuu' exists.");
        } else {
            System.out.println("Key 'Ammuu' does not exist.");
        }
        if (contactList.containsValue(34567)){
            System.out.println("Value '34567' exists.");
        } else {
            System.out.println("Value '34567' does not exist.");
        }
        System.out.println("\nContact List:");
        Iterator<Map.Entry<String, Integer>> itr = contactList.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}