package tasks6;

import java.util.Scanner;

public class _7_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int countOfNight = Integer.parseInt(scanner.nextLine());

        double studio = 0;
        double apartment = 0;


        if (month.equals("May") || month.equals("October")) {

            studio = 50.0 * countOfNight;
            apartment = 65.0 * countOfNight;

            if (countOfNight > 7 && countOfNight <= 14) {
                studio *= 0.95;

            }
            if (countOfNight > 14) {
                studio *= 0.70;
                apartment *= 0.90;

            }

        }
        else if (month.equals("June") || month.equals("September")) {

            studio = 75.20 * countOfNight;
            apartment = 68.70 * countOfNight;

            if (countOfNight > 14) {
                studio *= 0.80;
                apartment *= 0.90;
            }

        }
        else if (month.equals("July") || month.equals("August")) {

            studio = 76.0 * countOfNight;
            apartment = 77.0 * countOfNight;

            if (countOfNight > 14) {
                apartment *= 0.90;
            }

        }

        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartment, studio);



    }
}
