package Array1D;

import java.util.Scanner;

public class Exercise044_DeleteElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                for(int j = i; j <= n - 2; j++){
                    arr[j] = arr[j + 1];
                }
                found = true;
                break;
            }
        }
        if (found){
            for(int i = 0; i < n - 1; i++){
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("NOT FOUND");
        }

        sc.close();
    }
}
