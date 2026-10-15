
import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement {
    // Majority Element
    // Given an integer array of size n, find all elements that appear more than [
    // n/3 ] times.
    // nums[ ] = (1, 3, 2, 5, 1, 3, 1, 5, 1);
    // ans=1
    public static void main(String[] args) {
        // given
        int arr[] = { 1, 2, 3, 5, 1, 3, 1, 5, 1 };

        HashMap<Integer, Integer> hm = new HashMap<>();
        int k = arr.length / 3;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        for(Integer key : hm.keySet()){
            if(hm.get(key) > k){
                list.add(key);
            }
        }
        System.out.println(list);

    }
}
