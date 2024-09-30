package tasks6;

import java.util.Scanner;

public class _8_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;

        if (arrivalTime > examTime) {
            System.out.println("Late");
            int minutesLate = arrivalTime - examTime;
            if (minutesLate < 60) {
                System.out.printf("%d minutes after the start%n", minutesLate);
            }
            else {
                int hoursLate = minutesLate / 60;
                int minutesLeft = minutesLate % 60;
                System.out.printf("%d:%02d hours after the start%n", hoursLate, minutesLeft);
            }
        }
        else if (examTime - arrivalTime <= 30) {
            System.out.println("On time");
            if (examTime != arrivalTime) {
                int minutesEarly = examTime - arrivalTime;
                System.out.printf("%d minutes before the start%n", minutesEarly);
            }
        }
        else {
            System.out.println("Early");
            int minutesEarly = examTime - arrivalTime;
            if (minutesEarly < 60) {
                System.out.printf("%d minutes before the start%n", minutesEarly);
            }
            else {
                int hoursEarly = minutesEarly / 60;
                int minutesLeft = minutesEarly % 60;
                System.out.printf("%d:%02d hours before the start%n", hoursEarly, minutesLeft);
            }
        }



    }
}
