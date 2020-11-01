package jsample;

public class Solution2 {

    public int[] solve(int k, int n, int[][] arr) {
        return divideAndMerge(arr, 0, k - 1);
    }

    private int[] divideAndMerge(int[][] arr, int low, int high) {
        if (high - low == 0) {
            return arr[low];
        }
        if (high - low == 1) {
            return mergeTwoArray(arr[low], arr[high]);
        } else {
            int mid = (high - low) / 2;
            return mergeTwoArray(divideAndMerge(arr, 0, mid), divideAndMerge(arr, mid + 1, high));
        }
    }

    private int[] mergeTwoArray(int[] firstArray, int[] secondArray) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] outputArray = new int[firstArray.length + secondArray.length];
        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] <= secondArray[j]) {
                outputArray[k++] = firstArray[i++];
            } else {
                outputArray[k++] = secondArray[j++];
            }
        }
        System.arraycopy(firstArray, i, outputArray, k, firstArray.length - i);
        System.arraycopy(secondArray, j, outputArray, k, secondArray.length - j);
        return outputArray;
    }
}
