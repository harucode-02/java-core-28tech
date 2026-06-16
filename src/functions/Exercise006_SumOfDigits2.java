package functions;

import java.util.Scanner;

public class Exercise006_SumOfDigits2 {
    static long sum_digit(long n) {
        long sumDigit = 0;
        long digit;

            while(n > 0){
               digit = n % 10;
               sumDigit += digit;
               n = n / 10;
            }

        return sumDigit;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long x;

        for(int i = 1; i <= n; i++){
            x = sc.nextLong();
            System.out.print(sum_digit(x) + " ");
        }

        sc.close();
    }
}
