package jsample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {

    public List<Integer> solve(int n) {
        return findGrayCodes(n);
    }

    private List<Integer> findGrayCodes(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        if (n == 1) {
            return Arrays.asList(0, 1);
        } else {
            List<Integer> grayCodes = new ArrayList<>(findGrayCodes(n - 1));
            for (int i = grayCodes.size() - 1; i >= 0; i--) {
                grayCodes.add(grayCodes.get(i) | (1 << n - 1));
            }
            return grayCodes;
        }
    }
}