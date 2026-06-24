package Array1D;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise049_MarkingArray2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            boolean check = false;
            for(int j = 0; j <= i - 1; j++){
                if(arr[i] == arr[j]){
                    check = true;
                    break;
                }
            }

            int count = 0;
            for(int k = 0; k < n; k++){
                if(arr[i] == arr[k]){
                    count++;
                }
            }

            if(!check) {
                System.out.println(arr[i] + " " + count);
            }
        }

        sc.close();
    }
}
