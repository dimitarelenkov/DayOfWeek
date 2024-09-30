package tasks2;

import java.util.Scanner;

public class _9_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        




        double percent = Double.parseDouble(scanner.nextLine());
        int volumeInSm = width * height * length;
        double volumeInLiters = volumeInSm / 1000.0;
       double finalVolume = volumeInLiters - (volumeInLiters * (percent / 100));
        System.out.println(finalVolume);



    }
}
