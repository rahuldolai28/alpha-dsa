
import java.util.Stack;

public class NextGreaterElement {
    // The next greater element of some element x in an array is the first greater
    // element that is to the right of x in the same array.
    // arr = [6, 8, 0, 1, 3]
    // nextGreater = [8,-1,1,3,-1];

    public static int[] nextGreaterArray(int arr[]) {

        Stack<Integer> s = new Stack<>();

        int ans[] = new int[arr.length];

        for (int idx = arr.length - 1; idx >= 0; idx--) {
            // pop
            while (!s.isEmpty() && arr[idx] >= arr[s.peek()]) {
                s.pop();
            }

            // check greater
            if (s.isEmpty()) {
                ans[idx] = -1;
            } else {
                ans[idx] = arr[s.peek()];
            }
            
            //push
            s.push(idx);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };

        int nextGreater[] = nextGreaterArray(arr);

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " , ");
        }

    }
}
