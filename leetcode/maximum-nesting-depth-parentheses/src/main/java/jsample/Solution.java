package jsample;

public class Solution {

    public int solve(String s) {
        int max = 0;
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                count++;
                max = Math.max(max, count);
            } else if (chars[i] == ')') {
                count--;
            }
        }
        return max;
    }
}
