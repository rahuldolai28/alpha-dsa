public class basic {

    public static void nTO1(int n) {
        System.out.println(n);
        if (n > 1) {
            nTO1(--n);
        }
    }

    public static void main(String[] args) {
        nTO1(4);
    }
}
