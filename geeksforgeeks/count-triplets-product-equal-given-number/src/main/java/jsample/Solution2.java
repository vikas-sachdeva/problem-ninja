package jsample;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public int solve(int[] arr, int num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        int tripletsCounter = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > num || arr[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] * arr[j] > num || arr[j] == 0) {
                    continue;
                }
                if (num % (arr[i] * arr[j]) == 0) {
                    int divisor = num / (arr[i] * arr[j]);
                    if (map.get(divisor) != null && map.get(divisor) > j) {
                        tripletsCounter++;
                        System.out.println("{" + arr[i] + "," + arr[j] + "," + divisor + "} ");
                    }
                }
            }
        }
        return tripletsCounter;
    }
}