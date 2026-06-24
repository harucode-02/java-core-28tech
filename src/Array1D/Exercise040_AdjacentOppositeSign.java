package Array1D;

import java.util.Scanner;

public class Exercise040_AdjacentOppositeSign {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if ((i > 0 && (long) arr[i] * arr[i - 1] < 0) || (i < (n - 1) && (long) arr[i] * arr[i + 1] < 0)) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
