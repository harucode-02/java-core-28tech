package Array1D;

import java.util.Scanner;

public class Exercise015_VowelsAndConsonants {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] arr = new char[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next().charAt(0);
        }

        for(int i = 0; i < n ; i++){
            char c = Character.toLowerCase(arr[i]);
            if(c == 'u' || c == 'e' || c == 'o' || c == 'a' || c == 'i'){
                System.out.print(c + " ");
            }
        }

        System.out.println();

        for(int i = n - 1; i >= 0; i--){
            char c = Character.toLowerCase(arr[i]);
            if(c != 'u' && c != 'e' && c != 'o' && c != 'a' && c != 'i'){
                System.out.print(c + " ");
            }
        }
        sc.close();
    }
}
