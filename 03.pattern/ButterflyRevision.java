public class ButterflyRevision {

    public static void drawPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    System.out.print("*");
                    continue;
                }
                if ((n - 2 - (2 * i)) >= 0 && n / 2 >= i) {
                    System.out.print(" ");
                    continue;
                }
               
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8;
        drawPattern(n);
    }
}
