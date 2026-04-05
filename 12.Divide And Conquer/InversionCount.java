//  Given an array of integers. Find the Inversion Count in the array. (HARD)

// Inversion Count: For an array, inversion count indicates how far (or close) the array is from
// being sorted. If the array is already sorted then the inversion count is 0. If an array is
// sorted in the reverse order then the inversion count is the maximum.
// Formally, two elements a[i] and alj] form an inversion if a[i] > alj] and i <j.

// Sample Input 1 : N = 5, arr[] = {2, 4, 1, 3, 5}
// Sample Output 1 : 3, because it has 3 inversions - (2, 1), (4, 1), (4,3).

// Sample Input 2 : N = 5, arr[] = {2, 3, 4, 5, 6}
// Sample Output 2 : 0, because the array is already sorted

// Sample Input 3 : N = 3, arrl = {5, 5, 5}
// Sample Output 3 : 0, because all the elements of the array are the same & already in a sorted
// manner.

public class InversionCount {

    public static int mergeSort(int arr[], int si, int ei) {
        if (si >= ei)
            return 0;

        int mid = si + (ei - si) / 2;

        int invCount = 0;

        // Left inversions
        invCount += mergeSort(arr, si, mid);

        // Right inversions
        invCount += mergeSort(arr, mid + 1, ei);

        // Merge inversions
        invCount += merge(arr, si, mid, ei);

        return invCount;
    }

    public static int merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si; // left pointer
        int j = mid + 1; // right pointer
        int k = 0;
        int invCount = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];

                // 🔥 KEY LINE
                invCount += (mid - i + 1);
            }
        }

        // Remaining elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy back
        for (int x = 0; x < temp.length; x++) {
            arr[si + x] = temp[x];
        }

        return invCount;
    }

    public static void main(String[] args) {
        int arr[] = { 2,1,3 };

        int result = mergeSort(arr, 0, arr.length - 1);

        System.out.println("Inversion Count = " + result);
    }
}