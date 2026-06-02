
import java.util.Stack;

public class ValidParentheses {

    // Valid Parentheses

    // Given a string s containing just the characters '(', ')', '(', ')', '[' and
    // ']', determine if the
    // input string is valid.
    // An input string is valid if:
    // 1. Open brackets must be closed by the same type of brackets.
    // 2. Open brackets must be closed in the correct order.
    // 3. Every close bracket has a corresponding open bracket of the same type.

    // s = "ODO"

    // S = "()"

    // s="(]"

    // s=")("

    public static boolean checkValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {

                if (s.isEmpty()) {
                    return false;
                }

                if ((ch == ')' && s.peek() == '(') ||
                        (ch == '}' && s.peek() == '{') ||
                        (ch == ']' && s.peek() == '[')) {

                    s.pop();
                } else {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "([])[{}]()";
        boolean ans = checkValid(str);
        System.out.println(ans);
    }

}
