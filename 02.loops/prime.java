import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i <=num ; i++) {
            if(num%i == 0){
                count++;
            }
        }
        if(count>2){
            System.out.println("Given number is not prime.");
        }
        else{
            
            System.out.println("Given number is  prime.");
        }
        sc.close();
    }
}
