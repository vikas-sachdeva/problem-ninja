package jsample;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public boolean solve(int[] array, int num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] > num) {
                continue;
            }
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] + array[j] > num) {
                    continue;
                }
                int thirdValue = num - array[i] - array[j];
                if (map.containsKey(thirdValue) && map.get(thirdValue) > j) {
                    System.out.println(array[i] + ", " + array[j] + ", " + thirdValue);
                    return true;
                }
            }
        }
        return false;
    }
}
