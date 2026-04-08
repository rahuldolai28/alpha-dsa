public class BTonArrays {

    // it is a example case to learn backtracking

    // input array = 1,1,1,1,1
    // middle state before base case = 1,2,3,4,5
    // after base = -1,0,1,2,3

    public static void example(int[] arr, int i) {

        if (i == arr.length) {
             print(arr);
            return;
        }

        arr[i] = i + 1;
        example(arr, i + 1);

        arr[i] -= 2;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        example(arr, 0);
        System.out.println("");
        print(arr);
    }
}
