package Excercises.SimpleConditions;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int firstRacerTimeInSeconds = Integer.parseInt(
                console.nextLine());
        int secondRacerTimeInSeconds = Integer.parseInt(
                console.nextLine());
        int thirdRacerTimeInSeconds = Integer.parseInt(
                console.nextLine());

        int totalSeconds = firstRacerTimeInSeconds +
                secondRacerTimeInSeconds +
                thirdRacerTimeInSeconds;

        int minutesInTotalSeconds = totalSeconds / 60;
        int pureSecondsInTotalSeconds = totalSeconds % 60;

        System.out.printf("%d:%02d",
                minutesInTotalSeconds,
                pureSecondsInTotalSeconds);
    }
}
