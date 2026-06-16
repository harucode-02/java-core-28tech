package loops;

import java.util.Scanner;

public class Exercise040_MultipleTestCases {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int T = Math.abs(t);

        for (int i = 1; i <= T; i++) {
            int k = sc.nextInt();
            if(k % 2 == 0){
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
        }
        sc.close();
    }
}
