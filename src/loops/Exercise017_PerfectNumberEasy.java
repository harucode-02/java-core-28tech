package loops;

import java.util.Scanner;

public class Exercise017_PerfectNumberEasy {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isPerfect = true;
        int sumPerfect = 0;

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sumPerfect += i;
            }
        }

        System.out.println(sumPerfect == n ? "28tech" : "29tech");

        sc.close();
    }
}
