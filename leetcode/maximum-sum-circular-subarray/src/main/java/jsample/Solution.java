package jsample;

public class Solution {

    public int solve(int[] a) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum1 = 0;
        int minSum = Integer.MAX_VALUE;
        int currentSum2 = 0;
        int totalSum = 0;
        for (int i = 0; i < a.length; i++) {
            currentSum1 = Math.max(currentSum1 + a[i], a[i]);
            maxSum = Math.max(currentSum1, maxSum);
            currentSum2 = Math.min(currentSum2 + a[i], a[i]);
            minSum = Math.min(currentSum2, minSum);
            totalSum += a[i];
        }
        return maxSum < 0 ? maxSum : Math.max(maxSum, totalSum - minSum);
    }
}
