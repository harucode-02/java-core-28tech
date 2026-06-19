package Array1D;

import java.util.Scanner;

public class Exercise016_SumAndListPrimeNumbers {
    static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
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

        int sumPrime = 0;
        for(int i = 0; i < n; i++){
            if(isPrime(arr[i])){
                sumPrime += arr[i];
            }
        }
        System.out.println(sumPrime);

        for(int i = 0; i < n; i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
