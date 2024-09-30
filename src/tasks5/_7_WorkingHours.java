package tasks5;

import java.util.Scanner;

public class _7_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (hour >= 10 && hour <= 18) {
            if ("Monday".equals(day)
                    || "Tuesday".equals(day)
                    || "Wednesday".equals(day)
                    || "Thursday".equals(day)
                    || "Friday".equals(day)
                    || "Saturday".equals(day)) {
                System.out.println("open");
            } else if ( "Sunday".equals(day)) {
                System.out.println("closed");
            }

        }
        else {
            System.out.println("closed");
        }

    }
}
