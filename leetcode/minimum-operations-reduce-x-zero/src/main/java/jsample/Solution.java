package jsample;

public class Solution {

    public int solve(int[] nums, int x) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int target = sum - x;
        if (target == 0) {
            return nums.length;
        }
        int left = 0;
        int right = 1;
        int currentSum = nums[left];
        int maxSize = -1;
        while (left < nums.length && right < nums.length) {
            if (currentSum < target) {
                currentSum += nums[right++];
            } else if (currentSum == target) {
                maxSize = Math.max(maxSize, right - left);
                currentSum -= nums[left++];
            } else {
                currentSum -= nums[left++];
            }
        }
        if (currentSum == target) {
            maxSize = Math.max(maxSize, right - left);
        }
        return maxSize == -1 ? -1 : nums.length - maxSize;
    }
}