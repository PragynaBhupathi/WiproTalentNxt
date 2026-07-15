import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
public class HOA3 {
	 public static void main(String[] args) {
	        Properties p = new Properties();
	        p.put("Andhra Pradesh", "Amaravati");
	        p.put("Telangana", "Hyderabad");
	        p.put("Karnataka", "Bengaluru");
	        p.put("Tamil Nadu", "Chennai");
	        p.put("Kerala", "Thiruvananthapuram");
	        System.out.println("States and their Capitals:");
	        Iterator<Map.Entry<Object, Object>> itr = p.entrySet().iterator();
	        while (itr.hasNext()) {
	            Map.Entry<Object, Object> entry = itr.next();
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	    }
}