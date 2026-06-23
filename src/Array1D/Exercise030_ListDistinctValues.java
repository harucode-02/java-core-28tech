package Array1D;

import java.util.Scanner;

public class Exercise030_ListDistinctValues {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean check = false;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] == arr[i]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
