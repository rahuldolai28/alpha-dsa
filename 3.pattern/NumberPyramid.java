public class NumberPyramid {
    public static void main(String[] args) {
        int num = 5;
        int count = 1;
        for (int i = 0; i < num; i++) {
            // spaces
            for (int j = 0; j < num - i + 1; j++) {
                System.out.print(" ");
            }
            // count
            for (int k = 0; k < i + 1; k++) {
                System.out.print(count + " ");
            }
            count++;
            System.out.println("");

        }
    }
}
