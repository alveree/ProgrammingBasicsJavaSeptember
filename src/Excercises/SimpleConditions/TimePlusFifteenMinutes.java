package Excercises.SimpleConditions;

import java.util.Scanner;

public class TimePlusFifteenMinutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int hours = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine());

        int totalMinutes = (hours * 60) + minutes;
        int timeAfterFifteenMinutes = totalMinutes + 15;

        int currentHours = timeAfterFifteenMinutes / 60;
        int currentHoursToBeDisplayed = currentHours % 24;
        int currentMinutes = timeAfterFifteenMinutes % 60;

        System.out.printf("%d:%02d",
                currentHoursToBeDisplayed,
                currentMinutes);
    }
}
