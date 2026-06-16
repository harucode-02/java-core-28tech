package loops;

import java.util.Scanner;

public class Exercise020_Check2022Number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean check = false;
        for(int i = 1; i <= n; i++){
            int found = sc.nextInt();
            if(found == 2022){
                check = true;
            }
        }
        if(check){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
