package Array1D;

import java.util.Scanner;

public class Exercise005_ElementAccess {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[0] + " " + arr[n - 1]);
        System.out.println(arr[1] + " " + arr[n - 2]);
        if (n % 2 != 0) {
            System.out.println(arr[n / 2]);
        } else {
            System.out.println("28tech");
        }

        sc.close();
    }
}
