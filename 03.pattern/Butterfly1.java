public class Butterfly1 {
     public static void main(String[] args) {
        int n = 4; // controls half wings

        // total rows = 2*n
        for (int i = 0; i < 2 * n; i++) {
            int stars = i < n ? i + 1 : 2 * n - i;
            int spaces = 2 * (n - stars);

            // left stars
            for (int j = 0; j < stars; j++) System.out.print("*");
            // spaces
            for (int j = 0; j < spaces; j++) System.out.print(" ");
            // right stars
            for (int j = 0; j < stars; j++) System.out.print("*");

            System.out.println();
        }
    }
}
