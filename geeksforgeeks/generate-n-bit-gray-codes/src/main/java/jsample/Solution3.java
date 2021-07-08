package jsample;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

    public List<Integer> solve(int n) {
        List<Integer> ans = new ArrayList<>();
        int length = 1 << n;
        for (int i = 0; i < length; i++) {
            ans.add(i ^ (i >> 1));
        }
        return ans;
    }
}