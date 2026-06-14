
import java.util.Arrays;

public class FractionalKnapsack {

    // Fractional Knapsack
    // Given the weights and values of N items, put these items in a knapsack of
    // capacity W to get the maximum total value in the knapsack.
    // value = [60, 100, 120]
    // weight = [10, 20, 30]
    // W = 50

    public static void main(String[] args) {

        int value[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int w = 50;
       
        // frac = value / wt
        double ratio[][] = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) value[i] / wt[i];
        }

        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        double ans = 0;
        int capacity = w;

        for (int i = 0; i < ratio.length; i++) {

            int idx = (int) ratio[i][0];

            if (capacity >= wt[idx]) {
                ans += value[idx];
                capacity -= wt[idx];
            } else {
                ans += ratio[i][1] * capacity;
                break;
            }
        }

        System.out.println(ans);

    }

}
