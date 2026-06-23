package Array1D;

import java.util.Scanner;

public class Exercise034_PositionOfMaxMin {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            min = Math.min(min, arr[i]);
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, arr[i]);
        }

        int minPos = 0;
        int maxPos = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == max){
                maxPos = i;
                break;
            }
        }

        for(int i = 0; i < n; i++){
            if (arr[i] == min){
                minPos = i;
            }
        }

        System.out.print(minPos + " " + maxPos);

        sc.close();
    }
}
