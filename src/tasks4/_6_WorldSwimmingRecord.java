package tasks4;

import java.util.Scanner;

public class _6_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double swimming = distanceInMeters * timeInSeconds;
       double intervals = Math.floor(distanceInMeters / 15);
       swimming = swimming + (intervals * 12.5);


        if (swimming < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", swimming);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", swimming - recordInSeconds);
        }
    }
}
