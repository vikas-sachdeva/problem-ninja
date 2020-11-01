package jsample;

public class Solution {

    public double solve(int poured, int query_row, int query_glass) {
        double[][] data = new double[query_row + 2][query_row + 2];
        if (poured < 1) {
            return 0;
        }
        data[0][0] = poured;
        double overflow;
        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i / 2; j++) {
                if (data[i][j] > 1) {
                    overflow = (data[i][j] - 1) / 2;
                    data[i][j] = 1;
                    data[i + 1][j] += overflow;
                    data[i + 1][j + 1] += overflow;
                    if (j != i - j) {
                        data[i][i - j] = 1;
                        data[i + 1][i - j] += overflow;
                        data[i + 1][i - j + 1] += overflow;
                    }
                }
            }
        }
        return data[query_row][query_glass];
    }
}