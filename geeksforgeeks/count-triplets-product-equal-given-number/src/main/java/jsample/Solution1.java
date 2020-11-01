package jsample;

public class Solution1 {

    public int solve(int[] arr, int num) {
        int tripletsCounter = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > num) {
                continue;
            }
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] * arr[j] > num) {
                    continue;
                }
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] * arr[j] * arr[k] == num) {
                        tripletsCounter++;
                        System.out.println("{" + arr[i] + "," + arr[j] + "," + arr[k] + "} ");
                    }
                }
            }
        }
        return tripletsCounter;
    }
}