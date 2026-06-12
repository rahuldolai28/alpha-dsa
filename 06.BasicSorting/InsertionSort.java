public class InsertionSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i-1; j>=0 ; j--) {
                if (arr[j]>temp) {
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 5,4,3,2 };
        sort(arr);
        printArr(arr);
    }
}
