
import java.util.HashMap;

public class LargestSubarray {
    // Largest subarray with 0 sum
    // arr = (15, -2, 2, -8, 1, 7, 10, 23}
    // ans = 5
    // arr = {3, 4, 5}
    // ans = 0
    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        HashMap<Integer, Integer> map = new HashMap<>();
        // cummalative sum , idx
        int length = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // important, handle edge cases
            if (sum == 0) {
                length = i + 1;
            }

            if (map.containsKey(sum)) {
                length = Integer.max(length, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println(length);

    }
}
