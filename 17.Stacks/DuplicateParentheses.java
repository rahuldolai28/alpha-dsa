
import java.util.Stack;

public class DuplicateParentheses {

    // Duplicate Parentheses
    // Given a balanced expression, find if it contains duplicate parentheses or
    // not. A set of
    // parentheses are duplicate if the same subexpression is surrounded by multiple
    // parentheses.

    // Return a true if it contains duplicates else return false.

    // example : (((a+(b)))+(c+d)) true

    // example : (( ((a) + (b) ) +c+d)) true

    // example : ((a + b ) + (c+d) ) false

    // example : (((a + b) ) +c) true

    public static boolean checkDuplicate(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ')') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    System.out.println("Error in expression");
                    return false;
                }

                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }

                s.pop(); // remove '('

                if (count < 1) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+(b)))+(c+d))";
        String str1 = "(( ( (a) + (b) ) +c+d))";
        String str2 = "((a + b ) + (c+d) )";
        String str3 = "(a+b))";
        String str4 = ")";

        boolean ans = checkDuplicate(str4);

        System.out.println("Duplicate parentheses present = " + ans);
    }

}
