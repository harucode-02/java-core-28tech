package Array1D;

import java.util.Scanner;

public class Exercise023_EvenOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int countEven = 0;
        int countOdd = 0;
        int sumEven = 0;
        int sumOdd = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
        }

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }

        System.out.println(countEven);
        System.out.println(countOdd);
        System.out.println(sumEven);
        System.out.println(sumOdd);

        sc.close();
    }
}
