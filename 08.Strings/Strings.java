
import java.util.Scanner;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static boolean pallindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void ShortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'N':
                    y++;
                    break;

                case 'S':
                    y--;
                    break;

                case 'W':
                    x--;
                    break;

                case 'E':
                    x++;
                    break;
                default:
                    System.out.println("There is some Wrong path given");
            }
        }
        double result = Math.sqrt( (x*x) + (y*y) );
        System.out.println(result);
    }

    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Strings are IMMUTABLE
        // purane strings ko change nehi kar sakte ,
        // uske liye naye strings formed hote hai

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // // System.out.println(name);
        // // System.out.println(name.length());

        // printLetters(name);

        // boolean a = pallindrome(name);
        // System.out.println(a);

        String path = "WNEENESENNN";
        ShortestPath(path);

    }
}
