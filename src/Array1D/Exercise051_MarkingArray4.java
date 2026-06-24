package Array1D;

import java.util.Scanner;

public class Exercise051_MarkingArray4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCount = 0;
        int result = 0;

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
                if (arr[i] == arr[k]) {
                    count++;
                }
            }

            if (!check) {
                if(count > maxCount){
                    maxCount = count;
                    result = arr[i];
                } else if (count == maxCount && arr[i] < result){
                    result = arr[i];
                }
            }
        }
        System.out.println(result + " " + maxCount);

        sc.close();
    }
}
