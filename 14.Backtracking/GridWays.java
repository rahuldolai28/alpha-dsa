// Find number of ways to reach from (0,0) to (N-1, M-1) in a NxM Grid.
// Allowed moves - right or down.

public class GridWays {

    public static int ways(int grid[][], int i, int j) {
        // base case
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return 1;
        }

        int right=0, down = 0;

        // recursion
        // right choice
        if (j < grid[0].length - 1) {
            right = ways(grid, i, j + 1);
        }

        // down choice
        if (i < grid.length - 1) {
            down = ways(grid, i + 1, j);
        }
        return right + down;
    }

    public static void main(String[] args) {
        int n = 2, m = 3;
        int grid[][] = new int[n][m];

        System.out.println(ways(grid, 0, 0));
        
    }

}
