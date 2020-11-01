package jsample;

public class Solution3 {

    /**
     * First sort the array using merge sort and then use 2 pointer technique to find the pair.
     *
     * @param arr array containing all elements
     * @param x   number to match
     * @return true if pair is found, else false.
     */
    public boolean solve(int[] arr, int x) {
        sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] > x) {
                j--;
            } else if (arr[i] + arr[j] < x) {
                i++;
            } else {
                System.out.println("{" + arr[i] + ", " + arr[j] + "}");
                return true;
            }
        }
        return false;
    }

    private void sort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
    }

    private void mergeSort(int[] arr, int low, int high, int[] temp) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid, temp);
        mergeSort(arr, mid + 1, high, temp);
        merge(arr, low, high, temp);
    }

    private void merge(int[] arr, int low, int high, int[] temp) {
        int mid = (low + high) / 2;
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] > arr[j]) {
                temp[k++] = arr[j];
                j++;
            } else {
                temp[k++] = arr[i];
                i++;
            }
        }
        System.arraycopy(arr, i, temp, k, mid - i + 1);
        System.arraycopy(arr, j, temp, k, high - j + 1);
        System.arraycopy(temp, 0, arr, low, high - low + 1);
    }
}
