package jsample;

public class Solution1 {

    public int[][] solve(int n) {
        int[][] array = new int[n][n];
        if (n == 0) {
            return array;
        }
        array[0][0] = 1;
        for (int i = 1; i < n; i++) {
            array[i][0] = 1;
            array[i][i] = 1;
            for (int j = 1; j <= i / 2; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }
            for (int j = i / 2 + 1; j <= i - 1; j++) {
                array[i][j] = array[i][i - j];
            }
        }
        return array;
    }
}
