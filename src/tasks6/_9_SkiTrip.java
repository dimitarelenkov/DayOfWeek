package tasks6;

import java.util.Scanner;

public class _9_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grades = scanner.nextLine();

        double sum = 0;
        days -= 1;

        if (room.equals("room for one person")) {
            sum = days * 18.00;
        }
        else if (room.equals("apartment")) {
            sum = days * 25.00;

            if (days < 10) {
                sum *= 0.70;
            }
            else if (days <= 15) {
                sum *= 0.65;
            }
            else {
                sum *= 0.50;
            }

        }
        else if (room.equals("president apartment")) {
            sum = days * 35.00;

            if (days < 10) {
                sum *= 0.90;
            }
            else if (days <= 15) {
                sum *= 0.85;
            }
            else {
                sum *= 0.80;
            }

        }
        if (grades.equals("positive")) {
            sum = sum + (sum * 0.25);
        }
        else {
            sum *= 0.90;
        }

        System.out.printf("%.2f", sum);
    }
}
