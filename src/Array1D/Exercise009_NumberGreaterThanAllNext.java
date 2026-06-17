package Array1D;

import java.util.Scanner;

public class Exercise009_NumberGreaterThanAllNext {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int count = 0;

        int max = arr[n - 1];
        result[count++] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                result[count++] = arr[i];
            }
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
