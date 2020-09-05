package jsample;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            for (int value : array) {
                printDivisorSum(value);
            }
        }
    }

    private static void printDivisorSum(int num) {
        int sum = 1;
        double sqrt = Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        if (sqrt % 1 == 0) {
            sum -= sqrt;
        }
        System.out.println(sum);
    }
}