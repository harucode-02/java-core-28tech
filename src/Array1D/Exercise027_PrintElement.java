package Array1D;

import java.util.Scanner;

public class Exercise027_PrintElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        for (int i = 0; i < n; i += 2) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        if(!found) {
            System.out.print("NONE");
        }

        sc.close();
    }
}
