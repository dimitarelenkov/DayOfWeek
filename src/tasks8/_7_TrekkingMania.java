package tasks8;

import java.util.Scanner;

public class _7_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        int musalaCount = 0;
        int monblanCount = 0;
        int kilimanjaroCount = 0;
        int k2Count = 0;
        int everestCount = 0;


        for (int i = 1; i <= group ; i++) {

            int peopleCount = Integer.parseInt(scanner.nextLine());

            if (peopleCount <= 5){
                musalaCount += peopleCount;
            }
            else if (peopleCount <= 12) {
                monblanCount += peopleCount;
            }
            else if (peopleCount <= 25) {
                kilimanjaroCount += peopleCount;

            }
            else if (peopleCount <= 40) {
                k2Count += peopleCount;
            }
            else {
                everestCount += peopleCount;
            }

        }
        int totalPeople = musalaCount + monblanCount
                + kilimanjaroCount + k2Count + everestCount;

        double musalaPercent = (double) musalaCount / totalPeople * 100;
        double monblanPercent = (double) monblanCount / totalPeople * 100;
        double kilimanjaroPercent = (double) kilimanjaroCount / totalPeople * 100;
        double k2Percent = (double) k2Count / totalPeople * 100;
        double everestPercent = (double) everestCount / totalPeople * 100;

        System.out.printf("%.2f%%\n", musalaPercent);
        System.out.printf("%.2f%%\n", monblanPercent);
        System.out.printf("%.2f%%\n", kilimanjaroPercent);
        System.out.printf("%.2f%%\n", k2Percent);
        System.out.printf("%.2f%%\n", everestPercent);
    }
}
