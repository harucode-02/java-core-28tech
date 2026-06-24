package Array1D;

import java.util.Scanner;

public class Exercise038_Listing {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isPalindrome(int n) {
       int original = n;
       int reversed = 0;
       while (n != 0){
           int temp = n;
           temp %= 10;
           reversed = reversed * 10 + temp;
           n /= 10;
       }
       return (reversed == original);
    }

    static boolean isPerfectSquare(int n) {
        for(int i = 0; i <= Math.sqrt(n); i++){
            if(i * i == n) return true;
        }
        return false;
    }

    static boolean isSumPrime(int n) {
        int sumPrime = 0;

        while (n != 0){
            int temp = n;
            temp %= 10;
            sumPrime += temp;
            n /= 10;
        }
        return isPrime(sumPrime);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int countIsPrime = 0;
        int countIsPalindrome = 0;
        int countIsPerfectSquare = 0;
        int countIsSumPrime = 0;

        for(int i = 0; i < n; i++){
            if(isPrime(arr[i])){
                countIsPrime++;
            }
            if (isPalindrome(arr[i])){
                countIsPalindrome++;
            }
            if (isPerfectSquare(arr[i])){
                countIsPerfectSquare++;
            }
            if (isSumPrime(arr[i])){
                countIsSumPrime++;
            }
        }

        System.out.println(countIsPrime);
        System.out.println(countIsPalindrome);
        System.out.println(countIsPerfectSquare);
        System.out.println(countIsSumPrime);

        sc.close();
    }
}
