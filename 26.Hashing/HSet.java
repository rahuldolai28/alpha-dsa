
import java.util.HashSet;

public class HSet {
    public static void main(String[] args) {
         int num[] = {4,3,2,5,6,7,3,4,2,1};
         HashSet<Integer> hs  = new HashSet<>();

         for(int n : num){
            hs.add(n);
         }
         System.out.println(hs.size());
    }
}
