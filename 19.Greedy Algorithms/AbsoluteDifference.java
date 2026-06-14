
import java.util.Arrays;

public class AbsoluteDifference {

    // Min Absolute Difference Pairs
    // Given two arrays A and B of equal length n.
    // Pair each element of array A to an element
    // in array B, such that sum S of absolute differences
    // of all the pairs is minimum.
    // A= [1, 2, 3]
    // B= [2, 1, 3]
    // ans = 0

    public static void main(String[] args) {
        int a[] = { 4, 1, 8, 7 };
        int b[] = { 2, 3, 6, 5 };

        Arrays.sort(a);
        Arrays.sort(b);

        int minDiff = 0;

        for (int i = 0; i < a.length; i++) {
            minDiff += Math.abs(a[i] - b[i]);
        }

        System.out.println(minDiff);

    }

}
