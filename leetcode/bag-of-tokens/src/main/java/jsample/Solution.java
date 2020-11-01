package jsample;

import java.util.Arrays;

public class Solution {

    public int solve(int[] tokens, int p) {
        Arrays.sort(tokens);
        int score = 0;
        int i = 0;
        int j = tokens.length - 1;
        while (i <= j) {
            if (tokens[i] <= p) {
                score++;
                p -= tokens[i];
                i++;
            } else if (score > 0 && i != j && tokens[j] + p >= tokens[i]) {
                score--;
                p += tokens[j];
                j--;
            } else {
                j--;
            }
        }
        return score;
    }
}