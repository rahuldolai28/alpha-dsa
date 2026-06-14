public class MaxBalancedStringPartitions {

    // Maximum Balanced String Partitions
    // We have balanced string str of size N with an equal number of L and R, 
    // the task is to find a maximum number X, such that a given string can be
    //  partitioned into X balancedsubstring. Astring is called to be balanced
    //  if the number of 'L's in the string equals the number of 'R's.
    // Input : "LRRRRLLRLLRL"
    // Output : 3

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int ans = 0;

        int lCount = 0, rCount =0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i ) == 'L' ) {
                lCount++;
            }
            else{
                rCount++;
            }
            if (lCount == rCount ) {
                ans++;
                
            }
        }
        System.out.println("Max number of partitioned Strings = " + ans);

    }

}
