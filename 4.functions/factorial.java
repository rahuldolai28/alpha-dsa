import java.util.Scanner;



public class factorial {
        public static int Factorial1(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int num = sc.nextInt();

        System.out.println(Factorial1(num));
        sc.close();
    }
}
