package Array1D;

import java.util.Scanner;

public class Exercise026_GreaterAndSmaller {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int countSmaller = 0;
        int countBigger = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > x) countBigger++;
            else if(arr[i] < x) countSmaller++;
        }

        System.out.println(countSmaller);
        System.out.println(countBigger);

        sc.close();
    }
}
