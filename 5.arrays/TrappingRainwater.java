public class TrappingRainwater {
    public static void calculate(int numbers[]) {
        int[] leftMax = new int[numbers.length];
        int[] rightMax = new int[numbers.length];
        int temp = 0;
        for (int i = 0; i < leftMax.length; i++) {
            if (i == 0) {
                temp = numbers[i];
                leftMax[i] = temp;
            } else { 
                temp = Math.max(temp, numbers[i]);
                leftMax[i] = temp;
            }
        }
        for (int i = rightMax.length - 1; i >= 0; i--) {
            if (i == rightMax.length - 1) {
                temp = numbers[rightMax.length - 1];
                rightMax[i] = temp;
            } else {
                temp = Math.max(temp, numbers[i]);
                rightMax[i] = temp;
            }
        }

        int water = 0;
        for (int i = 0; i < numbers.length; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - numbers[i];
        }
        System.out.println("The total amount of trappped water is: "+ water);

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        calculate(height);
    }
}

