package Conditionals_Operators;

import java.util.Scanner;

public class Exercise033_CPlusPlus {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int countC = 0;
        int countPlus = 0;

        for(int i = 1; i <= n; i++){
            char c = sc.next().charAt(0);
            if(c == 'C') {
                countC++;
            } else if(c == '+'){
                countPlus++;
            }
        }
        if(countC >= 1 && countPlus >= 2){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
