package functions;

import java.util.Scanner;

public class Exercise015_PalindromeNumber {
    static long reverse(long n) {
        long digit;
        long result = 0;
        while(n != 0) {
            digit = n % 10;
            result = result * 10 + digit;
            n = n / 10;
        }
        return result;
    }

    static boolean palindrome(int n) {
        return n == reverse(n);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b; i++){
            if(palindrome(i)){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
