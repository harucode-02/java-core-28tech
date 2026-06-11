package Loops;

import java.util.Scanner;

public class Exercise023_SumOfOdds {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long sum = 0;
        for (long i = 1; i <= n; i++) {
                sum += 2 * i - 1;
        }
        System.out.println(sum);

        sc.close();
    }
}
