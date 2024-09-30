package tasks8;

import java.util.Scanner;

public class _8_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentCount = Integer.parseInt(scanner.nextLine());
        int pointCount = Integer.parseInt(scanner.nextLine());

        int bonusCount = 0;
        int wonMatchesCount = 0;


        for (int i = 1; i <= tournamentCount ; i++) {
            String tournamentLevel = scanner.nextLine();

            if (tournamentLevel.equals("F")) {

                bonusCount += 1200;


            }
            else if (tournamentLevel.equals("SF")) {

                bonusCount += 720;


            }
            else if (tournamentLevel.equals("W")) {

                bonusCount += 2000;
                wonMatchesCount++;

            }

        }
        System.out.printf("Final points: %d%n", pointCount + bonusCount);
        System.out.printf("Average points: %d%n", bonusCount / tournamentCount );
        System.out.printf("%.2f%%",(double)wonMatchesCount / tournamentCount * 100);

    }
}
