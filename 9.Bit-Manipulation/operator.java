
import java.util.Scanner;

public class operator {

    public static void checkEven(int n) {
        if ((n & 1) == 1) {
            System.out.println("ODD");
        } else {
            System.out.println("EVEN");
        }
    }

    public static void main(String[] args) {
        // System.out.println(4 & 5);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkEven(n);
        sc.close();
    }
}
