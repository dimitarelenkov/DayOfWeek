package tasks2;

import java.util.Scanner;

public class _2_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double radians = Double.parseDouble(input);

        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
    }
}
