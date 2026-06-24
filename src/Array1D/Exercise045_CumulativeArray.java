package Array1D;

import java.util.Scanner;

public class Exercise045_CumulativeArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] F = new int[n];
        F[0] = arr[0];

        for(int i = 1; i < n; i++){
            F[i] = F[i - 1] + arr[i];
        }

        for(int i = 0; i < n; i++){
            System.out.print(F[i] + " ");
        }
        sc.close();
    }
}
