
import java.util.Stack;

public class ReverseStack {

    // IN THIS METHOD WE NEED ONE EXTRA STACK T.C = O(n) AND S.C = O(n)
    // public static Stack<Integer> reverse(Stack<Integer> s) {
    // Stack<Integer> s2 = new Stack<>();
    // while (!s.isEmpty()) {
    // int top = s.pop();
    // s2.push(top);
    // }
    // return s2;
    // }

    // APPROACH 2 -> USING PUSH IN BOTTOM

    public static void pushBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        PrintUtils.print(s);

        reverse(s);

        PrintUtils.print(s);

    }
}
