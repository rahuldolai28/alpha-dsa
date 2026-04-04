// Search in Rotated Sorted Array
// input : sorted, rotated array with distinct numbers (in ascending order)
// It is rotated at a pivot point. Find the index of given element.
//array=4,5,6,7,0,1,2
//target=0
// output : 4

public class rotatedArray {

    public static int search(int arr[], int tar, int si, int ei) {

        // base
        if (si > ei) {
            return -1;
        }

        // kaam
        int mid = si + (ei - si) / 2;

        // case found
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on l1
        if (arr[si] <= arr[mid]) {
            // left side
            if (arr[si] <= tar && tar <arr[mid]) {
                return search(arr, tar, si, mid-1);
            }
            // right side
            else {
                return search(arr, tar, mid + 1, ei);
            }
        }
        // mid on l2
        else {
            // right side
            if (arr[mid] < tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);

            } else {
                return search(arr, tar, si, mid-1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int si = 0, ei = arr.length - 1;

        int target = 0;
        System.out.println(search(arr, target, si, ei));
    }
}
