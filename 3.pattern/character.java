public class character {
    public static void main(String[] args) {
        int num = 65;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                char ch = (char) num;
                System.out.print(ch);
                num++;
            }
            System.out.println("");
        }
    }
}
