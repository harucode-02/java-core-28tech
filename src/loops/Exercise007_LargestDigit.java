package loops;

import java.util.Scanner;

public class Exercise007_LargestDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long largest = n % 10;
        long digit;

        while(n >= 10){
            digit = (n / 10) % 10;
            largest = Math.max(digit, largest);
            n = n / 10;
        }
        System.out.println(largest);

        sc.close();
    }
}
