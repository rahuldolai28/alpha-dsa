public class PalindromicWithNumbers {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 0; i < num; i++) {
            //spaces
            for (int j = 0; j <num-i-1; j++) {
               System.out.print(" "); 
            }
            //numbers
            for (int k = i+1; k >1; k--) {
               System.out.print(k); 
            }
            for (int l = 1; l <= i+1; l++) {
                System.out.print(l);
            }

            System.out.println("");
        }
    }
}
