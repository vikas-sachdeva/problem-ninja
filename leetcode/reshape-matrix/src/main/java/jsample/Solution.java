package jsample;

public class Solution {

    public int[][] solve(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] ans = new int[r][c];
        int k = 0;
        int l = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = mat[k][l++];
                if (l == mat[k].length) {
                    l = 0;
                    k++;
                }
            }
        }
        return ans;
    }
}