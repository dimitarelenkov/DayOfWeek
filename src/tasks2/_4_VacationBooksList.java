package tasks2;

import java.util.Scanner;

public class _4_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int allHoursToRead =allPages / pagesPerHour;
        int hoursInDay =  allHoursToRead / daysToRead;
        System.out.println(hoursInDay);


    }
}
