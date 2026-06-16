package loops;

import java.util.Scanner;

public class Exercise045_InvertedTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j1 = 1; j1 <= 2 * i - 2; j1++){
                System.out.print(" ");
            }
            for(int j2 = 1; j2 <= 2 * (n - i) + 1 ; j2++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
