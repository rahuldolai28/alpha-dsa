import java.util.*;
// Weakest Soldier
// We are given an mxn binary matrix of 1's (soldiers) and O's (civilians). The soldiers are
// positioned in front of the civilians. That is, all the 1's will appear to the left of all the O's
// in each row.
// A row i is weaker than a row j if one of the following is true:
// . The number of soldiers in row i is less than the number of soldiers in row j.
// . Both rows have the same number of soldiers and i < j.
// Find the K weakest rows.
// m=4, n=4, k=2
// 1000
// 1111
// 1000
// 1000

// ans = row0 & row2
public class WeakestSoldier {
    public static class Soldier implements Comparable<Soldier> {
        int idx;
        int jawans;

        public Soldier(int idx, int jawans) {
            this.idx = idx;
            this.jawans = jawans;
        }
        @Override 
          public int compareTo(Soldier s2){
            if(this.jawans == s2.jawans){
                 return this.idx - s2.idx;
            }else{
                return this.jawans - s2.jawans;
            }
        }

    }

    public static void main(String[] args) {
        PriorityQueue<Soldier> pq = new PriorityQueue<>();
        int army[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 }
        };
        for(int  i = 0 ; i<army.length ; i++){
            int count = 0 ; 
            for(int j =0 ; j<army[i].length; j++){
                count += army[i][j] == 1 ? 1 :0 ;
            }
            pq.add(new Soldier(i, count));
        }

        while(!pq.isEmpty()){
            System.out.println(pq.remove().idx);
        }
    }
}
