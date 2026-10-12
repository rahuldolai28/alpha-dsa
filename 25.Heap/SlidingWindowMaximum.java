
import java.util.PriorityQueue;

// Sliding Window Maximum
// Maximum of all Subarrays of Size K
// 1,3,-1,-3,5,3,6,7
// K=3
// ans = 3,3,5,5,6,7
public class SlidingWindowMaximum {
      static class Window implements Comparable<Window> {
        int idx;
        int value;
        public Window(int idx, int value){
            this.idx = idx;
            this.value = value;
        }
        @Override 
        public int compareTo(Window s2){
            return s2.value - this.value; //sorting decending
        }
    }

    public static void main(String[] args) {
        //given
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int  k = 3;
        PriorityQueue<Window> pq = new PriorityQueue<>();
        //initialize
        for(int i = 0 ; i < k -1; i++ ){
            pq.add(new Window(i, arr[i]));
        }
        //main loop
        int ans[] = new int[arr.length-k+1];
        for(int i = 0 ; i<ans.length; i++){
            int j = i+(k-1);
            System.out.println(j);
            pq.add(new Window(j, arr[j]));
            while(pq.peek().idx < i ){
                pq.remove();
            }
            ans[i] = pq.peek().value;
        }

          for(int i = 0 ; i<ans.length; i++){
            System.out.print(ans[i] + " ");
          }

    }
}
