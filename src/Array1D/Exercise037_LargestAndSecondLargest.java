package Array1D;

import java.util.Scanner;

public class Exercise037_LargestAndSecondLargest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] <= max1){
                if(arr[i] > max2){
                    max2 = arr[i];
                }
            }
        }
        System.out.print(max1 + " " + max2);

        sc.close();
    }
}
