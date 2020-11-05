package jsample;

public class Solution {

    public int solve(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 0) {
            return 0;
        }
        int maxPower = 0;
        int currentPower = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                currentPower++;
            } else {
                maxPower = Math.max(maxPower, currentPower);
                currentPower = 1;
            }
        }
        return Math.max(maxPower, currentPower);
    }
}
