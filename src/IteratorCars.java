import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCars {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Renault");
        cars.add("Mercedes");
        cars.add("Citroen");

        Iterator<String> it = cars.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
