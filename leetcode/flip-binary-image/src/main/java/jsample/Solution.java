package jsample;

public class Solution {

    public int[][] solve(int[][] a) {
        int[] temp;
        for (int i = 0; i < a.length; i++) {
            temp = new int[a[i].length];
            for (int j = a[i].length - 1; j >= 0; j--) {
                temp[a[i].length - 1 - j] = a[i][j] == 1 ? 0 : 1;
            }
            a[i] = temp;
        }
        return a;
    }
}
