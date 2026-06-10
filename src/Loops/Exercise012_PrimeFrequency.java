package Loops;

import java.util.Scanner;

public class Exercise012_PrimeFrequency {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long count2 = 0;
        long count3 = 0;
        long count5 = 0;
        long count7 = 0;
        long digit;

        while (n > 0) {
            digit = n % 10;
            if (digit == 2) {
                count2++;
            } else if (digit == 3) {
                count3++;
            } else if (digit == 5) {
                count5++;
            } else if (digit == 7) {
                count7++;
            }
            n = n / 10;
        }

        if(count2 > 0) System.out.println("2 " + count2);
        if(count3 > 0) System.out.println("3 " + count3);
        if(count5 > 0) System.out.println("5 " + count5);
        if(count7 > 0) System.out.println("7 " + count7);

        sc.close();
    }
}
