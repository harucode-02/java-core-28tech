package Array1D;

import java.util.Scanner;

public class Exercise032_BalancedPrimeElement {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {

            int sumLeft = 0;
            for (int j = 0; j <= i - 1; j++) {
                sumLeft += arr[j];
            }

            int sumRight = 0;
            for (int k = i + 1; k < n; k++) {
                sumRight += arr[k];
            }

            if (isPrime(sumLeft) && isPrime(sumRight)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
