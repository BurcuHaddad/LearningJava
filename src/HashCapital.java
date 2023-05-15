import java.util.HashMap;

public class HashCapital {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        for (String j : capitalCities.keySet()) {
            System.out.println("key: " + j + " value: " + capitalCities.get(j));
        }
    }
}
