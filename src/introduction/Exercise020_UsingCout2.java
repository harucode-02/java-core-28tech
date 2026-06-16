package introduction;

import java.util.Scanner;

public class Exercise020_UsingCout2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        System.out.printf("%06d\n", n);
        System.out.println(String.format("%6d", n).replace(' ', '#'));

        sc.close();
    }
}
