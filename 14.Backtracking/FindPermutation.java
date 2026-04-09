// public class FindPermutation {
//     // input = abc
//     // output = abc, acb, bac, bca, cab,cba

//     //time com = O(n*n!)

//     public static void find(String str, String ans) {
//         // base case
//         if (str.length() == 0) {
//             System.out.println(ans);
//             return;
//         }

//         // recursion
//         for (int i = 0; i < str.length(); i++) {
//             char curr = str.charAt(i);
//             String newStr = str.substring(0, i) + str.substring(i + 1);
//             find(newStr, ans + curr);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         find(str, "");
//     }
// }

//optimized from chatgpt lol 
public class FindPermutation {

    public static void find(char[] arr, int index) {
        if (index == arr.length) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            swap(arr, index, i);     // do
            find(arr, index + 1);    // explore
            swap(arr, index, i);     // undo
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        find("abc".toCharArray(), 0);
    }
}