package Array1D;

import java.util.Scanner;

public class Exercise020_ProductOfFactorials {
    static long factorial(long n) {
        long factorial = 1;
        for(long i = 1; i <= n; i++){
            factorial = (factorial * i) % (1_000_000_007);
        }
        return factorial;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        long result = 1;
        for(int i = 0; i < n; i++){
            result = (result * factorial(arr[i]) % (1_000_000_007));
        }
        System.out.println(result);
        sc.close();
    }
}
