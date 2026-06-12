
public class ithBit {

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // set ith bit
    // bitmask = 1 <<i
    // return n | bitmask

    public static int clearIthBits(int n , int i ){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }



    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int i = sc.nextInt();
        // int result = getIthBit(n, i);
        // System.out.println(result);
        // sc.close();
        System.out.println(clearIthBits(15, 2));
    }
}
