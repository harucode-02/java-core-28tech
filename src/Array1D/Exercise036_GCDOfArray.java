package Array1D;

import java.util.Scanner;

public class Exercise036_GCDOfArray {
    static int GCD(int a, int b) {
        if (b == 0) return a;
        else return GCD(b, a % b);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = GCD(result, arr[i]);
        }
        System.out.println(result);

        sc.close();
    }
}
