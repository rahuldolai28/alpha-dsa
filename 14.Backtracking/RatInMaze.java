public class RatInMaze {

    static int count = 0;

    public static void mazeSolver(int maze[][], int ans[][], int row, int col) {

        // invalid case
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length
                || maze[row][col] == 0 || ans[row][col] == 1) {
            return;
        }

        // mark current cell
        ans[row][col] = 1;

        // base case
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            count++;
            printMaze(ans);
            ans[row][col] = 0; // backtrack
            return;
        }

        // explore all 4 directions
        mazeSolver(maze, ans, row, col - 1); // LEFT
        mazeSolver(maze, ans, row, col + 1); // RIGHT
        mazeSolver(maze, ans, row + 1, col); // DOWN
        mazeSolver(maze, ans, row - 1, col); // UP

        // backtrack
        ans[row][col] = 0;
    }

    public static void printMaze(int ans[][]) {
        System.out.println("Solution Number: " + count);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 0, 1, 0, 1 },
                { 1, 1, 1, 1 }
        };

        int ans[][] = new int[maze.length][maze.length];

        mazeSolver(maze, ans, 0, 0);
    }
}