
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println("Area of Circle: " + area);

        System.out.println("Enter the entities: ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int area2 = length*width;
        System.out.println("Area of Reactangular: " +area2);
        sc.close();

    }
}
