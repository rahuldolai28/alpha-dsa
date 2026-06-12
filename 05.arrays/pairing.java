public class pairing {
    public static void pairAnArray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("[" + num[i] + " , " + num[j] + "], ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 5, 8, 9, 10, 30 };
        pairAnArray(num);
    }
}
