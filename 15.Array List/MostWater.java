// Container with Most Water
// For given n lines on x-axis, use 2 lines to form a container such
// that it holds maximum water.
// height = [1,8,6,2,5,4,8,3,7]

import java.util.ArrayList;

public class MostWater {

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        // brute force tc= O(n^2)
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int temp = Integer.min(height.get(i), height.get(j)) * (j - i);
                if (maxWater < temp) {
                    maxWater = temp;
                }
            }
        }

        // 2 Pointer Approach with tc of O(n)
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            // CALCULATE
            int ht = Math.min(height.get(lp), height.get(rp));
            int wd = rp - lp;
            int water = ht * wd;
            maxWater = Math.max(water, maxWater);

            // UPDATE POINTERS
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;

        //continue with 12
    }

    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
