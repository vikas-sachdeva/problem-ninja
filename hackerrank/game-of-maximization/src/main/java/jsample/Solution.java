package jsample;

public class Solution {

    public int solve(int n, int[] stones) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < stones.length; i++) {
            if (i % 2 == 0) {
                evenSum += stones[i];
            } else {
                oddSum += stones[i];
            }
        }
        return 2 * Math.min(evenSum, oddSum);
    }

}
