package Loops;

import java.util.Scanner;

public class Exercise009_OddEven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        n = Math.abs(n);

        long countOdd = 0;
        long countEven = 0;

        do {
            if ((n % 10) % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            n = n / 10;

        } while (n > 0);
        System.out.println(countOdd < countEven ? "28tech" : "29tech");

        sc.close();
    }
}
