import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class HOA6 {

    Hashtable<String, String> M1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Hashtable<String, String> createReverseMap() {

        Hashtable<String, String> M2 = new Hashtable<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    public ArrayList<String> getCountryList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        HOA6 obj = new HOA6();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Capital of India : "
                + obj.getCapital("India"));

        System.out.println("Country of Tokyo : "
                + obj.getCountry("Tokyo"));

        System.out.println("Reverse Map : "
                + obj.createReverseMap());

        System.out.println("Country List : "
                + obj.getCountryList());
    }
}