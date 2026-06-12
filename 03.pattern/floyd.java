public class floyd {
    public static void main(String[] args) {
        int num = 5;
        int count = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                if (count < 10) {
                    System.out.print(count + "  ");

                } else {
                    System.out.print(count + " ");

                }
                count++;
            }
            System.out.println("");
        }
    }
}
// i have a doubt in this file
// and it is written by me, might have issues
