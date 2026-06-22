package Array1D;

import java.util.Scanner;

public class Exercise018_OccurrenceCount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        char[] arr = new char[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next().charAt(0);
        }

        int countChar = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == c){
                countChar++;
            }
        }
        System.out.print(countChar + " ");

        sc.close();
    }
}
