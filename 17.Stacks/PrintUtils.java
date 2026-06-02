
// StackUtils.java
import java.util.Stack;

public class PrintUtils {

    public static <T> void print(Stack<T> stack) {

        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top");

        // Print without removing elements
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
        System.out.println("end");
    }
}
