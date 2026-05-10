// PAIR SUM - 2
// Find if any pair in a Sorted & Rotated ArrayList has a target sum.
// list = [11, 15, 6, 8, 9, 10], target=16

import java.util.ArrayList;

public class PairSum2 {

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        // FIND PIVOT
        int pivot = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;

            }
        }
        
        // 2 POINTER APPROACH
        int lp = pivot+1;
        int rp = pivot;
        int n = list.size();
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                System.out.println(list.get(lp) + " " + list.get(rp));
                return true;
            } else if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (rp - 1 + n) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum(list, target));
    }

}
