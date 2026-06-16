package loops;

import java.util.Scanner;

public class Exercise047_DrawShapeNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int margin;
        int gap;

        for(int i = 1; i <= n; i++){
            // Margin spaces
            if(i <= (n + 1) / 2){
                margin = (i - 1) * 2;
            } else {
                margin = (n - i) * 2;
            }
            for(int j = 1; j <= margin; j++){
                System.out.print(" ");
            }
            System.out.print(i);

            gap = (2 * n - 1) - 2 * margin - 2;
            if(gap > 0) {
                for(int k = 1; k <= gap; k++){
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
