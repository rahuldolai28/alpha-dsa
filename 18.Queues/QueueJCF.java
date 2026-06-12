
import java.util.LinkedList;
import java.util.Queue;

public class QueueJCF {
    public static void main(String[] args) {
        // In JCF queue is a interface not a class, so we need ll or deque to make
        // object
        Queue<Integer> q = new LinkedList<>(); // or we can go for dequeue
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
    }
}
