package jsample;

public class Solution1 {

    public boolean solve(int[] array, int num) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] > num) {
                continue;
            }
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] + array[j] > num) {
                    continue;
                }
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == num) {
                        System.out.println(array[i] + ", " + array[j] + ", " + array[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
