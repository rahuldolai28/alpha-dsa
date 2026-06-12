
import java.util.LinkedList;
import java.util.Queue;

public class Interleave {

    // Interleave 2 Halves of a Queue (even length)
    // input = 1 2 3 4 5 6 7 8 9 10
    // output = 1 6 2 7 3 8 4 9 5 10

    public static void doInterleave(Queue<Integer> org) {
        Queue<Integer> temp = new LinkedList<>();

        int size = org.size();

        for (int i = 0; i < size / 2; i++) {
            temp.add(org.remove());
        }
      

        while (!temp.isEmpty()) {
            org.add(temp.remove());
            org.add(org.remove());
        }

        // for odd case
        if (size % 2 != 0) {
            int data = org.remove();
            org.add(data);
        }

        System.out.println("Final queue " + org);

    }

    public static void main(String[] args) {
        Queue<Integer> org = new LinkedList<>();

        org.add(1);
        org.add(2);
        org.add(3);
        org.add(4);
        org.add(5);
        org.add(6);
        org.add(7);
        org.add(8);
        org.add(9);
        org.add(10);

        doInterleave(org);
    }
}
