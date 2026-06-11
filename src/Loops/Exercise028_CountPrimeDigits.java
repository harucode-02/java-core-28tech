package Loops;

import java.util.Scanner;

public class Exercise028_CountPrimeDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long countPrime = 0;
        long digit;

        while (n > 0){
            digit = n % 10;
            if(digit == 2 || digit == 3 || digit == 5 || digit == 7){
                countPrime++;
            }
            n /= 10;
        }
        System.out.println(countPrime);

        sc.close();
    }
}
