package Array1D;

import java.util.Scanner;

public class Exercise003_CountEvenOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int countOdd = 0;
        int countEven = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println(countEven + " " + countOdd);

        sc.close();
    }
}
