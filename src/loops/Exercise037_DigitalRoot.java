package loops;

import java.util.Scanner;

public class Exercise037_DigitalRoot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long digit;
        long sum = 0;

        while(n >= 10){
            while (n > 0){
                digit = n % 10;
                sum += digit;
                n /= 10;
            }
            n = sum;
            sum = 0;
        }

        System.out.println(n);

        sc.close();
    }
}
