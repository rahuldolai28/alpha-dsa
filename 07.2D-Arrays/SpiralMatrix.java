public class SpiralMatrix {

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j < endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow; i < endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol; j > startCol; j--) {
                System.out.print(matrix[endRow][j] + " ");

            }

            // left
            for (int i = endRow; i > startRow; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;

            if (startCol == endCol) {
                System.out.print(matrix[startCol][startCol]);
            }

            // expected output
            // 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10

        }
    }
    // 1, 2,3,4 100 200 300 400 90 80 70 60 50 13 9 5 6 7 8 12 16 15 14 10 11

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4, 100 },
                { 5, 6, 7, 8, 200 },
                { 9, 10, 11, 12, 300 },
                { 13, 14, 15, 16, 400 },
                { 50, 60, 70, 80, 90 }
        };
        printSpiral(matrix);
    }

}
