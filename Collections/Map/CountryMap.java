import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
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

    public HashMap<String, String> createReverseMap() {

        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    public ArrayList<String> getCountryList() {

        ArrayList<String> list = new ArrayList<>(M1.keySet());

        return list;
    }
}