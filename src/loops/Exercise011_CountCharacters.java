package loops;

import java.util.Scanner;

public class Exercise011_CountCharacters {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int countToUpper = 0;
        int countToLower = 0;
        int countNumber = 0;
        int countSpecial = 0;

        for(int i = 0; i < n; i++){
            char c = sc.next().charAt(0);
            if(Character.isUpperCase(c)){
                countToUpper++;
            } else if(Character.isLowerCase(c)){
                countToLower++;
            } else if(Character.isDigit(c)){
                countNumber++;
            } else {
                countSpecial++;
            }
        }
        System.out.println(countToLower + " " + countToUpper + " " + countNumber +  " " + countSpecial);

        sc.close();
    }
}
