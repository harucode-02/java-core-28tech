package loops;

import java.util.Scanner;

public class Exercise018_ListPerfectSquares {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        for(int i = 1; i <= Math.sqrt(n); i++) {
            System.out.print((long)i * i + " ");
        }

        sc.close();
    }
}
