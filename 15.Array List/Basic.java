
import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1); // O(1)
        list.add(2);
        list.add(4);

        

        System.out.println(list);

        // get operation O(1)
        int element = list.get(2);
        System.out.println(element);

        // remove element O(n)
        // list.remove(1);
        // System.out.println(list);

        // set
        list.set(2, 10);
        System.out.println(list);

        // contains
        // System.out.println(list.contains(2));
        // System.out.println(list.contains(12));

        list.add(1,9);  // O(n)
        System.out.println(list);

        System.out.println(list.size());

    }
}
