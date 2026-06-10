package Loops;

import java.util.Scanner;

public class Exercise006_SumOfDifferences {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long last;
        long first;
        long diff;
        long sum = 0;

        while (n >= 10){
            last = n % 10;
            first = (n / 10) % 10;
            diff = Math.abs(last - first);
            sum += diff;
            n = n / 10;
        }
        System.out.println(sum);

        sc.close();
    }
}
