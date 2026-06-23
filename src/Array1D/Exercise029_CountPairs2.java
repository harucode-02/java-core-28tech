package Array1D;

import java.util.Scanner;

public class Exercise029_CountPairs2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = Math.abs(arr[i] - arr[j]);
                minDiff = Math.min(temp, minDiff);
            }
        }

        System.out.println(minDiff);

        sc.close();
    }
}
