public class Butterfly {
    public static void main(String[] args) {
        int row = 8;
        for (int i = 0; i <= 3; i++) {

            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < row - 2 - (2 * i); l++) {
                System.out.print(" ");
            }
            for (int m = 0; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println("");
        }
          for (int i = 0; i <= 3; i++) {

            for (int k = 0; k <=3- i; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < (2 * i); l++) {
                System.out.print(" ");
            }
            for (int m = 0; m <= 3-i; m++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
