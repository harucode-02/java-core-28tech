package conditionalsOperators;

import java.util.Scanner;

public class Exercise014_StudentGradeClassification {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double result = ((a + b) * 1 + (c * 2) + (d * 3)) / 7;

        if(result >= 8){
            System.out.println("GIOI");
        } else if (result < 8 && result >= 6.5){
            System.out.println("KHA");
        } else if (result < 6.5 && result >=5) {
            System.out.println("TRUNG BINH");
        } else {
            System.out.println("YEU");
        }
        scanner.close();
    }
}
