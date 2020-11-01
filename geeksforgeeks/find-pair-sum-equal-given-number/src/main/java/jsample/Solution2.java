package jsample;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    public boolean solve(int[] arr, int x) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(x - arr[i])) {
                System.out.println("{" + arr[i] + ", " + (x - arr[i]) + "}");
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}