
import java.util.Stack;

public class MaxAreaInHistogram {
    // Given an array of integers heights representing the histogram's bar height
    // where the width of each bar is 1,
    // return the area of the largest rectangle in the histogram.
    // heights = [2,1,5,6,2,3]

    public static int[] rightNextSmallerArray(int arr[]) {

        // 1 , 6, 4, 4, 6, 6

        Stack<Integer> s = new Stack<>();
        int ans[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = arr.length;
            } else {
                ans[i] = s.peek();
            }

            s.push(i);

        }

        return ans;
    }

    public static int[] leftNextSmallerArray(int arr[]) {

        // -1, -1, 1, 2, 1, 4

        Stack<Integer> s = new Stack<>();

        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // pop
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            // check greater
            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }

            // push
            s.push(i);
        }

        return ans;
    }

    public static int maxArea(int[] h) {
        int max = 0;

        int[] left = leftNextSmallerArray(h);
        int[] right = rightNextSmallerArray(h);

        for (int i = 0; i < h.length; i++) {
            int area = h[i] * (right[i] - left[i] - 1);
            if (area > max) {
                max = area;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        int maxArea = maxArea(heights);
        System.out.println(maxArea);

    }
}
