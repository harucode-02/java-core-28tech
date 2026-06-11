package Loops;

import java.util.Scanner;

public class Exercise025_Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long factorial = 1;

        for(long i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println(factorial);

        sc.close();
    }
}
