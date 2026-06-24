package Array1D;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise048_MarkingArray1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        System.out.println(set.size());

        sc.close();
    }
}
