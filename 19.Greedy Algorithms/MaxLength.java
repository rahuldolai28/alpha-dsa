
import java.util.Arrays;
import java.util.Comparator;

public class MaxLength {

    // Max Length Chain of Pairs
    // You are given n pairs of numbers. In every pair, the first number is always
    // smaller than the
    // second number. A pair (c, d) can come after pair (a, b) if b < c.
    // Find the longest chain which can be formed from a given set of pairs.
    // pairs =
    // (5, 24)
    // (39, 60)
    // (5, 28)
    // (27,40)
    // (50, 90)
    // ans = 3

    public static void main(String[] args) {
        int si[] = { 5, 39, 5, 27, 50 };
        int ei[] = { 24, 60, 28, 40, 90 };

        int arr[][] = new int[ei.length][2];

        for (int i = 0; i < si.length; i++) {
           
            arr[i][0] = si[i];
            arr[i][1] = ei[i];
        }

        Arrays.sort(arr, Comparator.comparingInt((o) -> o[1]));

        int ans = 1;
        int temp = arr[0][1];
        for (int i = 1; i < si.length; i++) {
            if (arr[i][0] > temp) {
                ans++;
                temp = arr[i][1];
            }
        }

        System.out.println(ans);
    }

}
