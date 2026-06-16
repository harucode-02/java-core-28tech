package loops;

import java.util.Scanner;

public class Exercise013_SumOfEvenDigitsOfN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n >= 0) {
            long digit;
            long sumEven = 0;

            while(n > 0){
                digit = n % 10;
                if(digit % 2 == 0){
                    sumEven += digit;
                }
                n = n / 10;
            }
            System.out.println(sumEven);
        } else {
            System.out.println("NEGATIVE");
        }

        sc.close();
    }
}
