package Excercises.SimpleCalculations;

import java.util.Scanner;

public class CelsiusToFarenheitConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double celsiusTemperature = Double.parseDouble(
                console.nextLine());

        double farenheitTemperature = celsiusTemperature * 1.8 +
                32;

        System.out.printf("%.2f", farenheitTemperature);
    }
}
