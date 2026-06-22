package Array1D;

import java.util.Scanner;

public class Exercise025_SmallestNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i = 0; i < n; i++){
           min = Math.min(min, arr[i]);
        }

        int countMin = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == min){
                countMin++;
            }
        }

        System.out.println(countMin);

        sc.close();
    }
}
