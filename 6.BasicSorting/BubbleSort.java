public class BubbleSort{
    public static void sort(int arr[]){
        for (int turn = 0; turn < arr.length-1; turn++) {
            for (int i = 0; i < arr.length-1-turn; i++) {
                if(arr[i]>arr[i+1]){
                    //swap
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]= temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={5,2,8,3,9,1};
        sort(arr);
        printArr(arr);

    }
}