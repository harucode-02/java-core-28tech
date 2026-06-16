package introduction;

import java.util.Scanner;

public class Exercise015_BuyNotebook {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int x = sc.nextInt();

        System.out.printf("SO VO MUA DUOC LA : %d !!!!!", n / x);

        sc.close();
    }
}
