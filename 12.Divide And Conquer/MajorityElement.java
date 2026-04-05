// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:
// Input: nums = [3,2,3]
// Output: 3

// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

public class MajorityElement {

    // most optimize solution with t of O(n) and s of O(1)
    // Use Boyer-Moore
    public static int majority(int[] nums) {
        int temp = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                temp = nums[i];
                count++;
            } else {
                if (temp == nums[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return temp;
    }

    // trying using divide and conquer
    public static int divide(int arr[], int si, int ei) {
        // base case
        if (si == ei) {
            return arr[si];
        }
        // kaam
        int mid = si + (ei - si) / 2;
        int leftMajor = divide(arr, si, mid);
        int rightMajor = divide(arr, mid + 1, ei);

        if (leftMajor == rightMajor) {
            return leftMajor;
        }

        // when conflict occurs
        int leftCount = count(arr, leftMajor, si, ei);
        int rightCount = count(arr, rightMajor, si, ei);

        return leftCount > rightCount ? leftMajor : rightMajor;

    }

    public static int count(int[] arr, int target, int si, int ei) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 2, 1, 2 };
        int result = majority(nums); // most optimized
        System.out.println(result);

        // using d&c
        System.out.println(divide(nums, 0, nums.length - 1));
    }
}
