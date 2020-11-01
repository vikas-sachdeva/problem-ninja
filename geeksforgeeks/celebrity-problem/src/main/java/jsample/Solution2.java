package jsample;

public class Solution2 {

    public int solve(int[][] matrix) {
        if (matrix.length == 0) {
            return -1;
        }
        int celebrity = -1;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 1) {
                celebrity = i;
                break;
            }
        }
        if (celebrity == -1) {
            celebrity = 0;
        }
        int rowSum = 0;
        int colSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            colSum += matrix[i][celebrity];
            rowSum += matrix[celebrity][i];
        }
        if (rowSum == 0 && colSum == matrix.length - 1) {
            return celebrity;
        } else {
            return -1;
        }
    }
}