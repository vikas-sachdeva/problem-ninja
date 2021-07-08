package jsample;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public List<Integer> solve(int n) {
        List<Integer> grayCodes = new ArrayList<>();
        grayCodes.add(0);
        if (n > 0) {
            grayCodes.add(1);
        }
        int factor = 1;
        for (int i = 2; i <= n; i++) {
            factor *= 2;
            for (int j = factor - 1; j >= 0; j--) {
                grayCodes.add(grayCodes.get(j) + factor);
            }
        }
        return grayCodes;
    }
}
