public class QuickSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void qSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // last element
        int pidx = partition(arr, si, ei);
        qSort(arr, si, pidx - 1); // left
        qSort(arr, pidx + 1, ei); // right

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for els smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; 
        arr[i] = temp;
        return i; 

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        System.out.print("Initial Array: ");
        printArr(arr);

        qSort(arr, 0, arr.length - 1);
        System.out.print("After sorting Array: ");

        printArr(arr);

    }
}
