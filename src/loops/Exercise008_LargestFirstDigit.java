package loops;

import java.util.Scanner;

public class Exercise008_LargestFirstDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long largest = n % 10;
        long digit;

        while(n >= 10){
            digit = (n / 10) % 10;
            largest = Math.max(largest, digit);
            n = n / 10;
        }
        System.out.println(n >= largest ? "YES" : "NO");

        sc.close();
    }
}
