import java.util.ArrayList;
import java.util.HashSet;

public class UI {
    // Union & Intersection of 2 arrays
    // arr1 = {7, 3, 9}
    // arr2 = {6, 3, 9, 2, 9, 4}
    // union = 6 (7, 3, 9, 6, 2, 4)
    // intersection = 2 (3, 9)
    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        for (int n : arr1) {
            hs.add(n);
        }
        for(int n: arr2){
            if(hs.contains(n)){
                hs.remove(n);
                intersection.add(n);
            }
        }
        System.out.println(intersection);
        for(int n:arr2){
            hs.add(n);
        }
        for(int n : hs){
            union.add(n);
        }
        System.out.println(union);
    }
}
