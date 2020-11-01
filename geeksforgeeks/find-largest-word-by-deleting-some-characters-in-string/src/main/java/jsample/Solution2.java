package jsample;

public class Solution2 {

    public String solve(String[] dict, String str) {
        int maxlength = -1;
        String longestStr = null;
        for (int i = 0; i < dict.length; i++) {
            if (maxlength < dict[i].length() && isSubString(str, dict[i])) {
                maxlength = dict[i].length();
                longestStr = dict[i];
            }
        }
        return longestStr;
    }

    private boolean isSubString(String str1, String str2) {
        int j = 0;
        for (int i = 0; i < str1.length() && j < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
        }
        return j == str2.length();
    }
}
