package Array1D;

import java.util.Scanner;

public class Exercise033_ListAndCountFibonacci {
    static boolean isFibonacci(long n) {
        long a = 0;
        long b = 1;

        if (n == 0) {
            return true;
        }

        while (a <= n && b <= n) {
            long temp = a + b;
            a = b;
            b = temp;

            if (a == n || b == n) {
                return true;
            }
        }
        return false;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (isFibonacci(arr[i])) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("NONE");
        }

        sc.close();
    }
}
