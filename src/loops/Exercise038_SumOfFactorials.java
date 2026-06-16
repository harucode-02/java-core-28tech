package loops;

import java.util.Scanner;

public class Exercise038_SumOfFactorials {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int factorial = 1;
        int sumFactorial = 0;

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sumFactorial += factorial;
            factorial = 1;
        }
        System.out.println(sumFactorial);
        sc.close();
    }
}
