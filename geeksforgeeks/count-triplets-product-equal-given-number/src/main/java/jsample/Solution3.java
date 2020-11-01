package jsample;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {

    public int solve(int[] arr, int num) {
        Map<Integer, Integer> map = new HashMap<>();
        int tripletsCounter = 0;
        boolean isFirstLoop = true;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > num || arr[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] > num || arr[j] == 0) {
                    continue;
                }
                if (num % (arr[i] * arr[j]) == 0) {
                    int divisor = num / (arr[i] * arr[j]);
                    if ((map.get(divisor) != null && isFirstLoop) || (map.get(divisor) != null && map.get(divisor) > j)) {
                        tripletsCounter++;
                        System.out.println("{" + arr[i] + "," + arr[j] + "," + divisor + "} ");
                    }
                }
                if (isFirstLoop) {
                    map.put(arr[j], j);
                }
            }
            isFirstLoop = false;
        }
        return tripletsCounter;
    }
}