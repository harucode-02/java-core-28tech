package loops;

import java.util.Scanner;

public class Exercise049_DrawLetterShape {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 == 0) {
                        System.out.print((char)('A' + (i + j)));
                    } else {
                        System.out.print((char)('a' + (i + j)));
                    }
                }
                System.out.println();
            }
        sc.close();
    }
}
