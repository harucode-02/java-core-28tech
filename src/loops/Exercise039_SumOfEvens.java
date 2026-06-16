package loops;

import java.util.Scanner;

public class Exercise039_SumOfEvens {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long sum = 0;

        for(long i = 1; i <= n; i++){
            long k =  sc.nextLong();
            if(k % 2 == 0){
                sum += k;
            }
        }
        System.out.println(sum);

        sc.close();
    }
}
