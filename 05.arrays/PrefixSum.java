public class PrefixSum {
    // Prefix Sum: "What is the sum of this range quickly?"
    // Find maximum subarray sum, Kadane is better.
    // But if the problem asks:
    // Answer many range-sum queries quickly
    // Prefix Sum is extremely useful.
    public static void subArraySum(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                // for(int k = start; k<=end;k++){
                // //subarray sum
                // currSum += num[k];
                // }

                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }

        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 5, 8 };
        subArraySum(num);
    }
}
