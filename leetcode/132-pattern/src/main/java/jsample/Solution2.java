package jsample;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    public boolean solve(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int minIndex = 0;
        for (int i = 1; i < nums.length - 2; i++) {
            if (nums[i] < nums[minIndex]) {
                queue.add(i);
                minIndex = i;
            }
        }
        outer:
        while (!queue.isEmpty()) {
            int i = queue.peek();
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
            queue.poll();
        }
        return !queue.isEmpty();
    }
}