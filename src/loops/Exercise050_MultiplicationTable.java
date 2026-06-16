package loops;

import java.util.Scanner;

public class Exercise050_MultiplicationTable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 10; j++){
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }

        sc.close();
    }
}
