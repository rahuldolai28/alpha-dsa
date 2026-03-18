public class power {

    // print x to the power n ( with logN time complxity )
    public static int calculate(int x, int n) {

        if (n == 0) {
            return 1;
        }
        int half = calculate(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate(3, 4));
        ;
    }
}
