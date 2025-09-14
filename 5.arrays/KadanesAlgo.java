public class KadanesAlgo {

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

            //all negative case
            if ( numbers[i] > negativeSum  ) {
                negativeSum = numbers[i];
            }

        }
        if (negativeSum<0) {
            maxSum = negativeSum;
        }
        System.out.println("Our max subarray sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        Kadanes(numbers);
    }
}
