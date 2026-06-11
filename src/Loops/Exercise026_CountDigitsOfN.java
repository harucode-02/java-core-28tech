package Loops;

import java.util.Scanner;

public class Exercise026_CountDigitsOfN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        n = Math.abs(n);

        long count = 0;

        do {
            count++;
            n /= 10;
        } while (n != 0);

        System.out.println(count);
        sc.close();
    }
}
