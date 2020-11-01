package jsample;

public class Solution {

    /**
     * If we take a closer look, we can notice that, we basically need to find the number that has rightmost bit set at same position as
     * n and all other bits as 0. For example, for n = 5 (101), our output is 001. For n = 48 (110000), our output is 010000
     * How do we find a number that has same rightmost set bit and all other bits as 0?
     * We follow below steps.
     * <p>
     * Let n = 48 (00110000)
     * Subtract one from n, i.e., we do n-1. We get 47(00101111)
     * Do negation of (n-1), i.e., we do ~(n-1). We get (11010000).
     * Do n & (~(n-1)), we get 00010000 which has value 16.
     */

    public int solve(int n) {
        return n & ~(n - 1);
    }
}
