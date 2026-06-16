package loops;

import java.util.Scanner;

public class Exercise029_BuyBeer {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int bia = n / 28;
        int vo = bia;
        int doiDuoc;

        while (vo >= 3) {
            doiDuoc = vo / 3;
            bia += doiDuoc;
            vo = vo % 3 + doiDuoc;
        }
        System.out.println(bia);

        sc.close();
    }
}
