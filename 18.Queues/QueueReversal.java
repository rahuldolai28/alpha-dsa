
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    // reverse a queue
    // in = 1 2 3 4 5
    // out = 5 4 3 2 1

    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        System.out.println(q);

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        reverse(q);
    }
}
