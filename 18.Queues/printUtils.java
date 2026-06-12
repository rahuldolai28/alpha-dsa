import java.util.Queue;

public class printUtils {
    public static <T> void printQueue(Queue<T> q) {
        if (q.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front");

        for (T item : q) {
            System.out.println(item);
        }

        System.out.println("Rear");
    }
}