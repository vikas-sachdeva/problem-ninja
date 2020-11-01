package jsample;

public class Solution {

    public int solve(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int actualNumber = arr[i] % k;
            arr[actualNumber] += k;
        }
        int maxRepeat = -1;
        int maxRepeatNo = -1;
        for (int i = 0; i < k; i++) {
            int divisor = arr[i] / k;
            if (divisor > maxRepeat) {
                maxRepeat = divisor;
                maxRepeatNo = i;
            }
        }
        return maxRepeatNo;
    }
}
