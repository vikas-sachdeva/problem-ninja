package jsample;

public class Solution1 {

    public String solve(String[] dict, String str) {
        int[] index = new int[dict.length];
        for (int i = 0; i < str.length(); i++) {
            char strChar = str.charAt(i);
            for (int j = 0; j < dict.length; j++) {
                if (index[j] < dict[j].length()) {
                    char temp = dict[j].charAt(index[j]);
                    if (strChar == temp) {
                        index[j]++;
                    }
                }
            }
        }
        int maxlength = -1;
        String longestStr = null;
        for (int i = 0; i < dict.length; i++) {
            if (dict[i].length() == index[i]) {
                if (dict[i].length() > maxlength) {
                    maxlength = dict[i].length();
                    longestStr = dict[i];
                }
            }
        }
        return longestStr;
    }
}
