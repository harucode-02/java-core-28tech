package Array1D;

import java.util.Scanner;

public class Exercise010_ModifyArray {
    static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(isPrime(arr[i])){
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
