package loops;

import java.util.Scanner;

public class Exercise027_SumOfDigitsOfN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long sum = 0;
        long digit;

        while (n > 0){
            digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println(sum);

        sc.close();
    }
}
