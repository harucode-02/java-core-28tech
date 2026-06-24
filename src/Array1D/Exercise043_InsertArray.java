package Array1D;

import java.util.Scanner;

public class Exercise043_InsertArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int x = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= k - 1; i--) {
            arr[i + 1] = arr[i];
        }

        arr[k - 1] = x;

        for (int i = 0; i < n + 1; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
