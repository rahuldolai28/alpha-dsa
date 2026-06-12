
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.print("Enter the Decimal Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("The binary of "+num +" = ");
        int res = 0;
        for (int i = 0; num!=0; i++) {
            int digit = num % 2 ;
            res += (int)Math.pow(10, i)*digit  ;
            num /= 2;
        }
        System.out.println(res);
        sc.close();
    }
}
