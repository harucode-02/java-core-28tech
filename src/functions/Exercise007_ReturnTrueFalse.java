package functions;

import java.util.Scanner;

public class Exercise007_ReturnTrueFalse {
    static boolean check(long n) {
        long sumDigit = 0;
        long digit;

        while (n > 0){
            digit = n % 10;
            sumDigit += digit;
            n = n / 10;
        }

        return sumDigit % 10 == 8;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        if(check(x)){
            System.out.println("28tech");
        } else {
            System.out.println("29tech");
        }

        sc.close();
    }
}
