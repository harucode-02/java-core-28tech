package Array1D;

import java.util.Scanner;

public class Exercise059_SearchInArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean[] mark = new boolean[10_000_001];
        for(int i = 0; i < n; i++){
            mark[arr[i]] = true;
        }

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int x = sc.nextInt();
            if(mark[x]){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
