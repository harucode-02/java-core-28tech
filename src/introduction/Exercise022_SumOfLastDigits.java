package introduction;

import java.util.Scanner;

public class Exercise022_SumOfLastDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x  = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();

        long t = ((x % 10) + (y % 100) + (z % 1000));

        System.out.println(t);

        sc.close();
    }
}
