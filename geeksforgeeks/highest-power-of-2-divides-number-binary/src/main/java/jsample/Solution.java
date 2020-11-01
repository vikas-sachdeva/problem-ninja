package jsample;

public class Solution {

    public int solve(String str) {
        int power = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '0') {
                power++;
            } else {
                break;
            }
        }
        return power;
    }
}
