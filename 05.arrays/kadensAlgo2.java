public class kadensAlgo2 {
    // more clener and shorter code from chatgpt
    
    public static void Kadanes(int numbers[]) {
        int currSum = numbers[0];
        int maxSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            currSum = Math.max(numbers[i], currSum + numbers[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Our max subarray sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -5, -3 };
        Kadanes(numbers);
    }
}
