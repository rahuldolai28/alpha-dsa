import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse;
        int output = 0;
        int count = 0;

        System.out.print("Reversed number is: ");

        while (num != 0) {
            reverse = num % 10;
            System.out.print(reverse);
            output = output * 10 + reverse;
            num /= 10;
            count++;
        }
        System.out.println("");
        System.out.println(output);
        sc.close();
    }
}