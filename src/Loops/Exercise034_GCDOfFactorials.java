package Loops;

import java.util.Scanner;

public class Exercise034_GCDOfFactorials {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long m = Math.min(a,b);

        long factorial = 1;

        for(int i = 1; i <= m; i++){
            factorial *= i;
        }
        System.out.println(factorial);

        sc.close();
    }
}
