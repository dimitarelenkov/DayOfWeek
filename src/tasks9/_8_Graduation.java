package tasks9;

import java.util.Scanner;

public class _8_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int counter = 1;
        double sum = 0;
        int excluded = 0;
        boolean isGradueted = true;

        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4.00) {
                excluded++;

                if (excluded == 2) {
                    isGradueted = false;
                    System.out.printf("%s has been excluded at %s grade",name, counter);
                    break;
                }
                continue;
            }
            sum += grade;
            counter++;

        }
        if (isGradueted) {

            System.out.printf("%s graduated. Average grade: %.2f",name, sum / 12);
        }

    }
}
