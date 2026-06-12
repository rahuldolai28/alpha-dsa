public class Rhombus {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i < num; i++) {
            // spaces
            for (int m = 1; m <= num - i; m++) {
                System.out.print(" ");
            }

            // hollow starts
            for (int j = 1; j <= num; j++) {
                if (i == 0 || i == num - 1 || j == 1 || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }
}
