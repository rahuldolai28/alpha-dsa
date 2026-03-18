public class basic {

    public static void nTO1(int n) {
        System.out.println(n);
        if (n > 1) {
            nTO1(--n);
        }
    }

    public static int sum(int n) {
        if (n == 1) {

            return 1;
        }
        return n + sum(--n);

    }

    public static void main(String[] args) {
        System.out.println( sum(4) );
    }
}
