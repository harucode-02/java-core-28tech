package Array1D;

import java.util.Scanner;

public class Exercise002_ProductOfElements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        long product = 1;
        long MOD = 1_000_000_007;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            product = (product * arr[i]) % MOD;
        }

        System.out.println(product);

        sc.close();
    }
}
