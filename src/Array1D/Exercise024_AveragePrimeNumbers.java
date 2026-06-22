package Array1D;

import java.util.Scanner;

public class Exercise024_AveragePrimeNumbers {
    static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        double sumPrime = 0;
        for(int i = 0; i < n; i++){
            if(isPrime(arr[i])){
                sumPrime += arr[i];
            }
        }

        double countPrime = 0;
        for(int i = 0; i < n; i++){
            if(isPrime(arr[i])){
                countPrime++;
            }
        }

        System.out.printf("%.3f", (sumPrime / countPrime));

        sc.close();
    }
}
