public class fibonacci {

    public static int fiboSum(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fiboSum(n - 1) + fiboSum(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fiboSum(7));
    }
}
