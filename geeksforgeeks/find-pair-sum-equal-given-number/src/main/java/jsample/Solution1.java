package jsample;

public class Solution1 {

    public boolean solve(int[] arr, int x) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println("{" + arr[i] + ", " + arr[j] + "}");
                    return true;
                }
            }
        }
        return false;
    }
}
