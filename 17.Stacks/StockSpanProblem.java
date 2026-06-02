import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {

    public static ArrayList<Integer> stackSpan(int arr[]) {

        Stack<Integer> idx = new Stack<>();
        ArrayList<Integer> span = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            while (!idx.isEmpty() && arr[idx.peek()] <= arr[i]) {
                idx.pop();
            }

            if (idx.isEmpty()) {
                span.add(i + 1);
            } else {
                span.add(i - idx.peek());
            }

            idx.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };

        ArrayList<Integer> span = stackSpan(stocks);

        System.out.println(span);
    }
}