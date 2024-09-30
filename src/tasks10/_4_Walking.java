package tasks10;

import java.util.Scanner;

public class _4_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;
        String command = scanner.nextLine();
        while (!command.equals("Going home")) {

            int steps = Integer.parseInt(command);

            goal -= steps;

            if (goal <= 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Going home")) {
            int homeSteps = Integer.parseInt(scanner.nextLine());
            goal -= homeSteps;
        }
        if (goal <= 0) {
            System.out.printf("Goal reached! Good job!%n" + "%d steps over the goal!", Math.abs(goal));
        }
        else {
            System.out.printf("%d more steps to reach goal.", goal);
        }
    }
}
