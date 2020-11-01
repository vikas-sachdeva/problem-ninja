package jsample;

public class Solution2 {

    public boolean solve(int n) {
        boolean[] temp = new boolean[n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (i == j * j) {
                    temp[i - 1] = true;
                } else {
                    if (!temp[i - j * j - 1]) {
                        temp[i - 1] = true;
                        break;
                    }
                }
            }
        }
        return temp[n - 1];
    }
}