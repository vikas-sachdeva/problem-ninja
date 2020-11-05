package jsample;

public class Solution {

    public int solve(int[] position) {
        int even = 0;
        int odd = 0;
        for (int value : position) {
            if ((value & 1) == 1) {
                odd++;
            } else {
                even++;
            }
        }
        return Math.min(even, odd);
    }
}