package Array1D;

import java.util.Scanner;

public class Exercise058_PositionOfMaxMin2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for(int i = 1; i < n; i++){
            if(min > arr[i]){
                 min = arr[i];
            }
        }

        System.out.println(min);

        for(int i = 0; i < n; i++){
            if(arr[i] == min){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        int max = arr[0];

        for(int i = 1; i < n; i++){
            if(max < arr[i]){
                 max = arr[i];
            }
        }

        System.out.println(max);

        for(int i = n - 1; i >= 0; i--){
            if(arr[i] == max){
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
