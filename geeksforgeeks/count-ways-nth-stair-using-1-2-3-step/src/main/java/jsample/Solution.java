package jsample;

public class Solution {

    public int count(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] tempCountStore = new int[n + 1];
        return countWays(n, tempCountStore);
    }

    private int countWays(int n, int[] tempCountStore) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        } else {
            if (tempCountStore[n] == 0) {
                tempCountStore[n] = countWays(n - 3, tempCountStore) + countWays(n - 2, tempCountStore) + countWays(n - 1, tempCountStore);
            }
            return tempCountStore[n];
        }
    }
}
