public class Diamond {
    public static void main(String[] args) {
        int num = 8;

        for (int i = 1; i <= num; i++) {
            // spaces
            int spaces = i <= (num / 2) + 1 ? (num / 2) - i + 1 : i - (num / 2) - 1;
            if (num % 2 == 0 &&i >= (num / 2) + 1  ) {
                spaces += 1;
            }

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // stars
            int stars;
            if (num % 2 == 0 && (num / 2 + 1) == i) {
                stars = num - 1;
            } else {
                stars = i <= (num / 2) + 1 ? 1 + 2 * (i - 1) : 1 + 2 * (num - i);
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
