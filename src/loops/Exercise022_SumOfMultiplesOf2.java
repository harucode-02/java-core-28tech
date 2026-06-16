package loops;

import java.util.Scanner;

public class Exercise022_SumOfMultiplesOf2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long sum = 0;

        for(long i = 1; i <= n; i++){
            sum += i * 2;
        }
        System.out.print(sum);

        sc.close();
    }
}
