import java.util.ArrayList;

public class InsertHeap {
    // min heap
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last idx
            arr.add(data);

            int child = arr.size() - 1;
            int parent = (child - 1) / 2; // fails when child = 0
            while (child > 0 && arr.get(child) < arr.get(parent)) {
                int temp = arr.get(parent);
                arr.set(parent, arr.get(child));
                arr.set(child, temp);

                child = parent;
                parent = (child - 1) / 2;
            }
        }

        public int peek() {
            if (arr.isEmpty()) {
                return -1;
            }
            // get min data from root or o index
            return arr.get(0);
        }

        public int remove() {
            if (arr.isEmpty()) {
                return -1;
            }
            // swap 1st and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // remove last element
            int ans = arr.remove(arr.size() - 1);

            // heapify
            heapify(0);
            return ans;
        }

        public void heapify(int idx) {
            int left = idx * 2 + 1;
            int right = idx * 2 + 2;
            // No children
            if (left >= arr.size()) {
                return;
            }
            // Find smaller child
            int minChild = left;
            if (right < arr.size() && arr.get(right) < arr.get(left)) {
                minChild = right;
            }
            // Already in correct position
            if (arr.get(idx) <= arr.get(minChild)) {
                return;
            }
            // Swap
            int temp = arr.get(idx);
            arr.set(idx, arr.get(minChild));
            arr.set(minChild, temp);
            // Continue downward
            heapify(minChild);
        }
        public boolean isEmpty(){
            return arr.isEmpty();
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(2);
        h.add(10);
        h.add(1);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }

}
