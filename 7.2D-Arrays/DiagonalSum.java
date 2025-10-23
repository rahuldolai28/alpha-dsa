public class DiagonalSum {

    public static void sum(int matrix[][]) {
        int primarySum = 0;
        int secondarySum = 0;
        int totalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            primarySum += matrix[i][i];
        }

        int j = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            secondarySum += matrix[j][i];

            j++;
        }

        totalSum = primarySum + secondarySum;

        // lets fix overlapping edge case
        boolean odd = false;
        if (matrix.length % 2 != 0 ) {
            odd = true;
        }
        if (odd) {
            int middle = matrix.length/2;
           totalSum = totalSum - matrix[middle][middle];  
        }

        System.out.println(secondarySum);
        System.out.println(primarySum);

        System.out.println(totalSum);
    }

    public static void main(String[] args) {
        // int matrix[][] = {
        // { 1, 2, 3, 4, 10 },
        // { 5, 6, 7, 8, 10 },
        // { 9, 10, 11, 12, 10 },
        // { 13, 14, 15, 16, 10 },
        // { 10, 20, 30, 40, 50 }
        // };

        int matrix[][] = {
                { 0, 1, 2 },
                { 3, 4, 5 },
                { 6, 7, 8 }
        };
        sum(matrix);
    }
}
