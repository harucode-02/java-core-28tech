package functions;

import java.util.Scanner;

public class Exercise003_ReferenceInCPlusPlus {
    static long solve(long a) {
        return a * 28;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();

        System.out.println(solve(x));

        sc.close();
    }
}
