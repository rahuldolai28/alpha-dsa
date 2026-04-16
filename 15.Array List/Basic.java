
import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1); //O(1)
        list.add(2);
        list.add(4);
    
        System.out.println(list);

        //get operation
        int element = list.get(2);
        System.out.println(element);
    }
}
