package tasks12;

import java.util.Scanner;

public class _4_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryCount = Integer.parseInt(scanner.nextLine());

        int allGradesCount = 0;
        double allGradeSum = 0;

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String namePres = command;
            double sumGrades = 0;

            for (int i = 1; i <= juryCount ; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrades += grade;

                allGradesCount++;
                allGradeSum += grade;
            }
            System.out.printf("%s - %.2f.%n", namePres, sumGrades / juryCount);
            command = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",allGradeSum / allGradesCount);

    }
}
