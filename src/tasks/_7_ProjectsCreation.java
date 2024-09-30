package tasks;

import java.util.Scanner;

public class _7_ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int numOfProjects = Integer.parseInt((scanner.nextLine()));
        int hours = 3;

        System.out.println("The architect " + name + " will need " + (numOfProjects * hours) + " hours to complete " + numOfProjects + " project/s.");




    }
}
