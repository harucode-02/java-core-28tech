package Loops;

import java.util.Scanner;

public class Exercise035_FactorialQuotient {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long factorial = 1;
        double res = 0;

        for(int i = 1; i <= n; i++){
            res += (double)1 / factorial;
            factorial = factorial * i;
        }
        System.out.printf("%.4f", res);

        sc.close();
    }
}
