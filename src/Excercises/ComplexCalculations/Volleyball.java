package Excercises.ComplexCalculations;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String yearType = console.nextLine();
        int numberOfHolidaysInYear = Integer.parseInt(
                console.nextLine());
        int weekendsInHomeTown = Integer.parseInt(
                console.nextLine());

        int weekendsForVolleyball = 48;
        int weekendsInSofia = weekendsForVolleyball -
                weekendsInHomeTown;
        double weekendsForVolleyballInSofia = 3.0 *
                weekendsInSofia / 4.0;
        double volleyballHolidays = 2.0 *
                numberOfHolidaysInYear / 3.0;
        double numberOfVolleyballDaysInSofia =
                weekendsForVolleyballInSofia +
                volleyballHolidays;
        int numberOfVolleyballDaysInHomeTown = weekendsInHomeTown;

        double numberOfVolleyballDaysInYear =
                numberOfVolleyballDaysInSofia +
                numberOfVolleyballDaysInHomeTown;

        if (yearType.equals("leap")) {
            numberOfVolleyballDaysInYear *= 1.15;
        }

        System.out.println((int)numberOfVolleyballDaysInYear);
    }
}
