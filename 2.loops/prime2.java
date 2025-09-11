
import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = false;

        if (num == 2) {
            System.out.println("Given number is prime.");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) {
                    isPrime = false;
                    System.out.println("Given number is not prime.");
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) {
                System.out.println("Given number is prime.");
            }
        }
        sc.close();
    }

}
