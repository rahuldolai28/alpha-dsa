
import java.util.Stack;

public class QueueS {

    public static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public void add(int data) { // O(1)
            s1.push(data);
        }

        public int remove() {
            // base
            if (s1.isEmpty() && !s2.isEmpty()) {
                return s2.pop();
            }

            // empty queue
            if (s1.isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            s2.push(s1.pop());
            int data = remove();
            if (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return data;
        }

        public int peek() {
            // empty queue
            if (s1.isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int front = s2.peek();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return front;
        }

        public void printStack() {
            System.out.println(s1);
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        q.printStack();

        q.remove();

        q.printStack();

    }
}
