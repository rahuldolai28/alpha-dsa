public class FindSubsets {
    // input = abc
    // output = a,b,c,ab,bc,ca,abc

    public static void find(String str, String ans, int i) {
        // base
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // recursion
        // yes choice
        find(str, ans + str.charAt(i), i + 1);
        // no choice
        find(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        find(str, ans, 0);
    }
}
