package jsample;

public class Solution1 {

    public int solve(int[][] matrix) {
        if (matrix.length == 0) {
            return -1;
        }
        int celebrity = -1;
        for (int i = 0; i < matrix.length; i++) {
            if (celebrity == i) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 1) {
                        return -1;
                    }
                }
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    if (celebrity == -1) {
                        celebrity = j;
                    } else if (celebrity != j) {
                        return -1;
                    }
                }
            }
            if (celebrity == -1) {
                celebrity = 0;
            }
        }
        return celebrity;
    }
}
