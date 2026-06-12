public class subarray {
    public static void arrays(int num[]) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("( ");
                int sum = 0;

                for (int j2 = i; j2 <= j; j2++) {

                    // System.out.print(num[j2] + " ");
                    sum = sum + num[j2];
                    System.out.print(" sum: "+sum + " ");

                    if (max < sum) {
                        max = sum;
                    }
                    if (min > sum) {
                        min = sum;
                    }
                    System.out.println("max: " + max + ", min: " + min);
                }
                System.out.print("), ");
            }
            System.out.println("");
        }
        System.out.println("The max value is : " + max);
        System.out.println("The min value is : " + min);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 5, 8 };
        arrays(num);
    }
}
