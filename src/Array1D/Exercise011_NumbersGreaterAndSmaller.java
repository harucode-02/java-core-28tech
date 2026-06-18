package Array1D;

import java.util.Scanner;

public class Exercise011_NumbersGreaterAndSmaller {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            int countLeft = 0;
            int countRight = 0;

            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    countLeft++;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    countRight++;
                }
            }
            System.out.println(countLeft + " " + countRight);
        }
        sc.close();
    }
}
