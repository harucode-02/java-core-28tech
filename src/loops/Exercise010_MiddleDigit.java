package loops;

import java.util.Scanner;

public class Exercise010_MiddleDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long count = 0;
        long original = n;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        if(count % 2 != 0){
           for(int i = 0; i < count / 2; i++){
               original = original / 10;
           }
           System.out.println(original % 10);
        }else{
            System.out.println("NOT FOUND");
        }

        sc.close();
    }
}
