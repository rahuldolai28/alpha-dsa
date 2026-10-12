import java.util.HashMap;

public class basicHashh {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // create
        hm.put("India", 200);
        hm.put("China", 300);
        hm.put("US", 100);
        System.out.println(hm);

        //Get 
        System.out.println(hm.get("India"));

        //containskey
        System.out.println(hm.containsKey("Africa"));
        System.out.println(hm.containsValue(100));

        //remove
        System.out.println(hm.remove("US"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Is empty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm);
    }
}
