package Loops;

import java.util.Scanner;

public class Exercise024_SumOfCubes {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long sumCubes = 0;

        for (long i = 1; i <= n; i++) {
            sumCubes += (long) i * i * i;
        }
        System.out.println(sumCubes);

        sc.close();
    }
}
