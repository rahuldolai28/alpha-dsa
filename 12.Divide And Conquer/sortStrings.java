public class sortStrings {

    public static void mergeSort(String arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        int i = si; // for left part
        int j = mid+1; // right
        int k = 0; // for temp array

        String[] temp = new String[ei - si + 1]; // size fixed

        while (i <= j && j <= ei) {
            if ((arr[i].compareTo(arr[j])) <= 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // remaining elements

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (k = 0, i = si; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }

    }

    public static void printArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String[] arr = {
                "sun",
                "earth",
                "mars",
                "mercury",
                "abc"
        };
        System.out.print("Before sorting : ");
        printArr(arr);
        mergeSort(arr, 0, arr.length - 1);

        System.out.print("After sorting : ");
        printArr(arr);
    }
}
