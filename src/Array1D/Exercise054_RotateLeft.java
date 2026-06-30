package Array1D;

import java.util.Scanner;

public class Exercise054_RotateLeft {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        k = k % n;

        int[] B = new int[n];

        for(int i = 0; i < n; i++){
            int j = (i - k + n) % n;
            B[j] = arr[i];
        }

        for(int j = 0; j < n; j++){
            System.out.print(B[j] + " ");
        }

        sc.close();
    }
}
