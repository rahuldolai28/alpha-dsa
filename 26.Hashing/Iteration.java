
import java.util.HashMap;
import java.util.Set;

public class Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 200);
        hm.put("China", 300);
        hm.put("US", 100);
        hm.put("Nepal", 50);

        // iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
    
        for (String k : keys) {
            System.out.println("key = " + k + ", value = "+hm.get(k));
        }
    }
}
