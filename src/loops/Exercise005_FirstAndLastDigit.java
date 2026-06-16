package loops;

import java.util.Scanner;

public class Exercise005_FirstAndLastDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long last = n % 10;
        while (n >= 10){
            n /= 10;
        }
        System.out.print(n + " " + last);

        sc.close();
    }
}
