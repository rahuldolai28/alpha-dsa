import java.util.Arrays;

// Indian Coins
// We are given an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100, 500, 2000].
// Find min no. of coins/notes to make change for a value V.
// V = 121
// ans = 3 (100+20+1)

// V = 590
// ans = 4 (500+50+20+20)

public class IndianCoins {

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        Arrays.sort(coins);
        int temp = amount;
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= temp) {
                temp = temp - coins[i];
                count++;
                i++;
            }
            if (temp == 0) {
                return count;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        int amount  = 590;
        int ans =  coinChange(coins, amount);
        System.out.println(ans);
    }
 
}
