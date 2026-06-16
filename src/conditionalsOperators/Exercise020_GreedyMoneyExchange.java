package conditionalsOperators;

import java.util.Scanner;

public class Exercise020_GreedyMoneyExchange {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n / 100;
        n = n % 100;
        count += n / 20;
        n = n % 20;
        count += n / 10;
        n = n % 10;
        count += n / 5;
        n = n % 5;
        count += n;

        System.out.println(count);

        sc.close();
    }
}
