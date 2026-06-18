package Array1D;

import java.util.Scanner;

public class Exercise012_GCDOfTwoNumbersInArray {
    static int GCD(int a, int b) {
        if (b == 0) return a;
        else return GCD(b, a % b);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                max = Math.max(max, GCD(arr[i], arr[j]));
            }
        }

        System.out.println(max);

        sc.close();
    }
}