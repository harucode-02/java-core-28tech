package Array1D;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise056_UniqueArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];

        result[0] = arr[0];
        int j = 1;

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i - 1]){
                result[j] = arr[i];
                j++;
            }
        }

        for(int i = 0; i < j; i++){
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
