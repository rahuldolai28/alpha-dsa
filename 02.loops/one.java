
import java.util.Scanner;

//one to ten loop
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // System.out.println(i);
        // sum = sum + i;
        // }
        // sc.close();
        // System.out.println(sum);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}