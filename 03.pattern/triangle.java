public class triangle {
    public static void main(String[] args) {
        boolean one = true;

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                one = true;
            }

            for (int j = 0; j <= i; j++) {
                if (one) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                one = !one;
            }
            System.out.println("");
        }

    }
}
