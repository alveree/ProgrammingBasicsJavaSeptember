package Exams.August282016;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String month = console.nextLine();
        int nightsToStay = Integer.parseInt(
                console.nextLine());

        double apartmentPrice = 0;
        double studioPrice = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                if (nightsToStay > 7 && nightsToStay <= 14) {
                    studioPrice *= 0.95;
                } else if (nightsToStay > 14) {
                    studioPrice *= 0.70;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (nightsToStay > 14) {
                    studioPrice *= 0.80;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                break;
        }

        if (nightsToStay > 14) {
            apartmentPrice *= 0.9;
        }

        System.out.printf("Apartment: %.2f lv.\n",
                apartmentPrice * nightsToStay);
        System.out.printf("Studio: %.2f lv.\n",
                studioPrice * nightsToStay);
    }
}
