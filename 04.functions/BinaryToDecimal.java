
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.print("Enter the Binary Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;

        for (int i = 0; num != 0; i++) {
            int digit = num % 10 ;
            res = res + (int)Math.pow(2, i)*digit;
            num = num/10;
        }
        System.out.print("The Decimal number is: ");
        System.out.println(res);
        sc.close();
    }
}
