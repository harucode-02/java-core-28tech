package Introduction;

import java.util.Scanner;

public class Exercise026_BankDeposit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(n * 4 / 100);

        sc.close();
    }
}
