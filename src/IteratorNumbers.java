import java.util.ArrayList;
import java.util.Iterator;

public class IteratorNumbers {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(12);
        numbers.add(3);
        numbers.add(25);
        numbers.add(7);
        numbers.add(1);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
