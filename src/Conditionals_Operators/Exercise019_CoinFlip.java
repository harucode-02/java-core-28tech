package Conditionals_Operators;

import java.util.Scanner;

public class Exercise019_CoinFlip {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long s = scanner.nextLong();
        long r = s % n;

        System.out.println(s / n + (r > 0 ? 1 : 0));
        scanner.close();
    }
}
