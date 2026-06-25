package Array1D;

import java.util.Scanner;

public class Exercise052_MarkingArray5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int maxCount = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean check = false;
            for (int j = 0; j < i - 1; j++) {
                if (arr[i] == arr[j]) {
                    check = true;
                    break;
                }
            }

            int count = 0;
            for (int k = 0; k < n; k++) {
                if (arr[i] == arr[k]) {
                    count++;
                }
            }

            if (!check) {
                if (maxCount < count) {
                    maxCount = count;
                    result = arr[i];
                }
            }
        }
        System.out.println(result + " " + maxCount);

        sc.close();
    }
}
