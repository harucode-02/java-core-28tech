package Array1D;

import java.util.Scanner;

public class Exercise031_Frequency {
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
                if (arr[i] == arr[j]) {
                    check = true;
                    break;
                }
            }

            int count = 0;

            for (int k = 0; k < n; k++) {
                if (arr[k] == arr[i]) {
                    count++;
                }
            }

            if (!check) {
                System.out.println(arr[i] + " " + count);
            }
        }

        sc.close();
    }
}
