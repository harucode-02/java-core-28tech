package Array1D;

import java.util.Scanner;

public class Exercise042_GreaterThanAdjacent {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i <= n - 2; i++){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
