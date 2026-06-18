package Array1D;

import java.util.Scanner;

public class Exercise013_ReverseArrayUnknownSize {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int x;
        int [] arr = new int[50000];

        while(sc.hasNextInt()){
            x = sc.nextInt();
            arr[n++] = x;
        }

        for(int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
