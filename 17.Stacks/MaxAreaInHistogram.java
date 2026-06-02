
import java.util.Stack;

public class MaxAreaInHistogram {
    // Given an array of integers heights representing the histogram's bar height
    // where the width of each bar is 1,
    // return the area of the largest rectangle in the histogram.
    // heights = [2,1,5,6,2,3]

    public static int[] rightNextSmallerArray(int arr[]) {

        // 1 , 5, 4, 4, 5, 5

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

            // push
            s.push(idx);
        }

        return ans;
    }

    public static int maxArea(int[] h){
        Stack<Integer> s = new Stack<>();

        


    }

    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
    }
}
