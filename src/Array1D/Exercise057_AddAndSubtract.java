package Array1D;

import java.util.Scanner;

public class Exercise057_AddAndSubtract {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n - 1];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++){
            b[i] = sc.nextInt();
        }

        int sum = a[0];

        for(int i = 1; i < n; i++){
            if(b[i - 1] == 1){
                sum += a[i];
            }
            else if(b[i - 1] == 2){
                sum -= a[i];
            }
        }

        System.out.println(sum);

        sc.close();
    }
}
