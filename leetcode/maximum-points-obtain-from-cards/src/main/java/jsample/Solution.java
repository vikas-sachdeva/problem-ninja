package jsample;

public class Solution {

    public int solve(int[] cardPoints, int k) {
        int sum = 0;
        for (int i = 0; i < cardPoints.length; i++) {
            sum += cardPoints[i];
        }
        int n = cardPoints.length;
        int currentSum = 0;
        int minSum = sum;
        for (int i = 0; i < n - k; i++) {
            currentSum += cardPoints[i];
        }
        for (int i = n - k; i < n; i++) {
            minSum = Math.min(minSum, currentSum);
            currentSum = currentSum + cardPoints[i] - cardPoints[i - n + k];
        }
        minSum = Math.min(minSum, currentSum);
        return sum - minSum;
    }
}