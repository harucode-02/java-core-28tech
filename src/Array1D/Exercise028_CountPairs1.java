package Array1D;

import java.util.Scanner;

public class Exercise028_CountPairs1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int sumIJ = 0;
        int countCouple = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                sumIJ = arr[i] + arr[j];
                if(sumIJ == k){
                    countCouple++;
                }
            }
        }

        System.out.println(countCouple);

        sc.close();
    }
}
