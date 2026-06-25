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

        int[] temp = new int[k];
        k %= n;

        for(int i = 0; i < k; i++){
            temp[i] = arr[i];
        }

        for(int i = 0; i < n-k; i++){
             arr[i] = arr[i + k];
        }

        for(int i = 0; i < n-k; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < k; i++){
            System.out.print(temp[i] + " ");
        }

        sc.close();
    }
}
