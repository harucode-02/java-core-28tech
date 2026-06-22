package Array1D;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise021_QuickSearch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[m];

        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            arrB[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            set.add(arrB[i]);
        }

        for (int i = 0; i < n; i++) {
            if(set.contains(arrA[i])){
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }

        sc.close();
    }
}
