package Array1D;

import java.util.Scanner;

public class Exercise046_WindowSizeK {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j <= i + k - 1; j++) {
                sum += arr[j];
            }
            System.out.print(sum + " ");
        }

        sc.close();
    }
}
