// Pair Sum
// Find if any pair in a Sorted ArrayList has a target sum.

// list = [1, 2, 3, 4, 5, 6], target=5

import java.util.ArrayList;

public class PairSum {

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        // BRUTE FORCE APPROACH

        // for (int i = 0; i < list.size(); i++) {
        // for (int j = i + 1; j < list.size(); j++) {
        // if (list.get(i) + list.get(j) == target) {
        // System.out.println(i + " " + j);
        // return true;
        // }
        // }
        // }
        // return false;

        // 2 POINTER APPROACH
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                System.out.println(lp + " " + rp);
                return true;
            } else if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println(pairSum(list, target));
    }
}
