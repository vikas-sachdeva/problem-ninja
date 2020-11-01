package jsample;

public class Solution1 {

    private Boolean[] temp;

    public boolean solve(int n) {
        temp = new Boolean[n];
        return solve(n, true);
    }

    private boolean solve(int n, boolean isAlice) {
        if (temp[n - 1] != null) {
            return temp[n - 1] == Boolean.TRUE ? isAlice : !isAlice;
        } else {
            double sqrtRoot = Math.sqrt(n);
            if (sqrtRoot % 1 == 0) {
                temp[n - 1] = true;
                return isAlice;
            } else {
                boolean isWin;
                for (int i = 1; i <= sqrtRoot; i++) {
                    isWin = solve(n - i * i, !isAlice);
                    if (isWin == isAlice) {
                        temp[n - 1] = true;
                        return isAlice;
                    }
                }
                temp[n - 1] = false;
                return !isAlice;
            }
        }
    }
}