package Array1D;

import java.util.Scanner;

public class Exercise004_FunctionWithArrayParameter {
    static void input(int a[], int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void change(int a[], int n) {
        for (int i = 0; i < n; i++) {
            a[i] = a[i] * 2;
        }
    }

    static void print(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        input(arr, n, sc);
        change(arr, n);
        print(arr, n);

        sc.close();
    }
}
