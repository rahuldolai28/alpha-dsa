import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        Collections.sort(list); // asceding
        System.out.println(list);

        // descending
        Collections.sort(list, Collections.reverseOrder());
        // comparator ek function hai jo sorting ke logic ko define karta hai
        System.out.println(list);
    }
}
