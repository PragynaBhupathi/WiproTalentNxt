public class HOA1 {

    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Capital of India : "
                + obj.getCapital("India"));

        System.out.println("Country of Tokyo : "
                + obj.getCountry("Tokyo"));

        System.out.println("\nReverse Map:");
        System.out.println(obj.createReverseMap());

        System.out.println("\nCountry List:");
        System.out.println(obj.getCountryList());
    }
}