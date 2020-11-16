package jsample;

public class Solution {

    public int solve(int[] a) {
        int up = 0;
        int down = 0;
        int maxLength = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] < a[i]) {
                if (down != 0) {
                    maxLength = Math.max(maxLength, up + down + 1);
                    up = 0;
                    down = 0;
                }
                up++;
            } else if (a[i - 1] > a[i] && up != 0) {
                down++;
            } else {
                if (down != 0) {
                    maxLength = Math.max(maxLength, up + down + 1);
                }
                up = 0;
                down = 0;
            }
        }
        if (down != 0) {
            maxLength = Math.max(maxLength, up + down + 1);
        }
        return maxLength;
    }
}