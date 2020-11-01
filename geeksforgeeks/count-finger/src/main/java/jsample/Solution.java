package jsample;

public class Solution {

    public int solve(int number) {
        switch (number % 8) {
            case 2:
            case 0:
                return 2;
            case 3:
            case 7:
                return 3;
            case 4:
            case 6:
                return 4;
            default:
                return number % 8;
        }
    }
}
