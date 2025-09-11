
import java.util.Scanner;

public class ncr {

        public static int factorial(int num) {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            return fact;
        }

        public static int binomial(int n, int r){
                int result;
                result = factorial(n) / ( factorial(r) * factorial(n-r) );
                return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.println("");
            System.out.print("Enter r: ");
            int r = sc.nextInt();
            System.out.print("The ans is : ");
            System.out.println(binomial(n, r));

            sc.close();
        }
    }

