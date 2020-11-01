package jsample;

public class Solution2 {

    public void solve(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("1");
        for (int i = 1; i < n; i++) {
            System.out.print("1 ");
            int c = 1;
            for (int j = 1; j < i; j++) {
                c = c * (i - j + 1) / j;
                System.out.print(c + " ");
            }
            System.out.println("1");
        }
    }
}
