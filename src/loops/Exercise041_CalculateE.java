package loops;

import java.util.Scanner;

public class Exercise041_CalculateE {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long factorial = 1;
        double sum = 1;
        double fraction = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                factorial *= j;
                fraction = (double) 1 / factorial;
            }
            sum += fraction;
            factorial = 1;
            fraction = 0;
        }
        System.out.printf("%.2f", sum);

        sc.close();
    }
}
