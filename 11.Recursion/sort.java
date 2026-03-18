public class sort {
    // check if given array is shorten or not

    public static boolean check(int[] arr,int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx + 1] < arr[idx]) {
            return false;
        }
        return check(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 2, 30, 40 };
        System.out.println(check(numbers, 0));
    }

}
