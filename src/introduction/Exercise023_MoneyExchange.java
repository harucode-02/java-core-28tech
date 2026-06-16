package introduction;

import java.util.Scanner;

public class Exercise023_MoneyExchange {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(n / 500000);
        System.out.println(n % 500000);

        sc.close();
    }
}
