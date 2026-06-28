package Array1D;

import java.util.Scanner;

public class Exercise053_InsertArray2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int[] arrA = new int[n + m];
        int[] arrB = new int[m];

        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            arrB[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= p; i--) {
            arrA[i + m] = arrA[i];
        }

        for (int i = 0; i < m; i++) {
            arrA[p + i] = arrB[i];
        }

        for (int i = 0; i < n + m; i++) {
            System.out.print(arrA[i] + " ");
        }

        sc.close();
    }
}
