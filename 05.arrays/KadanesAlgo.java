public class KadanesAlgo {

    // Kadane's Algorithm is an efficient algorithm used to find the maximum sum of
    // a contiguous subarray within an array of integers
    // Given an array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
    // The maximum sum contiguous subarray is: [4, -1, 2, 1]
    // with sum: 6

    public static void Kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int negativeSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);

            // all negative case
            if (numbers[i] > negativeSum) {
                negativeSum = numbers[i];
            }

        }
        if (negativeSum < 0) {
            maxSum = negativeSum;
        }
        System.out.println("Our max subarray sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        Kadanes(numbers);
    }
}
