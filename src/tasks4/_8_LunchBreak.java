package tasks4;

import java.util.Scanner;

public class _8_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String NameOfSeries = scanner.nextLine();
        int timeOfEpisode = Integer.parseInt(scanner.nextLine());
        int timeForRest = Integer.parseInt(scanner.nextLine());

       double lunchTime = timeForRest / 8.0;
       double pauseTime = timeForRest / 4.0;

       double timeForWatching = timeForRest - lunchTime - pauseTime;

       double diff = Math.abs(timeForWatching - timeOfEpisode);
       if (timeForWatching >= timeOfEpisode) {
           System.out.printf("You have enough time to watch %s " +
                   "and left with %.0f minutes free time.", NameOfSeries, Math.ceil(diff) );
       }
       else {
           System.out.printf("You don't have enough time to watch %s, " +
                   "you need %.0f more minutes.", NameOfSeries, Math.ceil(diff));
       }



    }
}
