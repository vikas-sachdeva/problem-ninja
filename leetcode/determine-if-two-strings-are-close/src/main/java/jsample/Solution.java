package jsample;

public class Solution {

    public boolean solve(String word1, String word2) {
        char[] word2Array = word2.toCharArray();
        int[] word2CharCount = new int[26];
        for (int i = 0; i < word2Array.length; i++) {
            int key = word2Array[i] - 97;
            word2CharCount[key]++;
        }
        char[] word1Array = word1.toCharArray();
        int[] word1CharCount = new int[26];
        for (int i = 0; i < word1Array.length; i++) {
            int key = word1Array[i] - 97;
            word1CharCount[key]++;
        }
        for (int i = 0; i < word1CharCount.length; i++) {
            if (word2CharCount[i] != 0 && word2CharCount[i] != word1CharCount[i]) {
                if (word1CharCount[i] == 0) {
                    return false;
                }
                int j;
                for (j = i + 1; j < word1CharCount.length; j++) {
                    if (word2CharCount[i] == word1CharCount[j]) {
                        word1CharCount[j] = word1CharCount[i];
                        break;
                    }
                }
                if (j == word1CharCount.length) {
                    return false;
                }
            }
        }
        return true;
    }
}