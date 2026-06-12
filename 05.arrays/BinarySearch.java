public class BinarySearch {
    public static int search(int numbers[],int key){
        int start = 0, end=numbers.length -1;

        while(start <= end){
            int mid = (start + end )/2;

            //comparisons
            if (numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,23};
        int key = 23;
    System.out.println("Index: "+ search(num,key));
    }
}
 