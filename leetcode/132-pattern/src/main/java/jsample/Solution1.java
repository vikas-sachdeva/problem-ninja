package jsample;

public class Solution1 {

    public boolean solve(int[] nums) {
        int i;
        outer:
        for (i = 0; i < nums.length - 2; i++) {
            int j = i;
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] < nums[k]) {
                    if (nums[j] > nums[k]) {
                        break outer;
                    } else {
                        j = k;
                    }
                }
            }
        }
        return i < nums.length - 2;
    }
}
