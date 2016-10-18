package Excercises.SimpleConditions;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double length = Double.parseDouble(console.nextLine());
        String sourceMeasureUnit = console.nextLine();
        String destinationMeasureUnit = console.nextLine();

        double lengthInMeters = length;

        switch (sourceMeasureUnit) {
            case "mm":
                lengthInMeters = length / 1000;
                break;
            case "cm":
                lengthInMeters = length / 100;
                break;
            case "mi":
                lengthInMeters = length / 0.000621371192;
                break;
            case "in":
                lengthInMeters = length / 39.3700787;
                break;
            case "km":
                lengthInMeters = length / 0.001;
                break;
            case "ft":
                lengthInMeters = length / 3.2808399;
                break;
            case "yd":
                lengthInMeters = length / 1.0936133;
                break;
        }

        double lengthInDestinationMeasureUnit = lengthInMeters;

        switch (destinationMeasureUnit) {
            case "mm":
                lengthInDestinationMeasureUnit =
                        lengthInMeters * 1000;
                break;
            case "cm":
                lengthInDestinationMeasureUnit =
                        lengthInMeters * 100;
                break;
            case "mi":
                lengthInDestinationMeasureUnit =
                        lengthInMeters * 0.000621371192;
                break;
            case "in":
                lengthInDestinationMeasureUnit =
                        lengthInMeters * 39.3700787;
                break;
            case "km":
                lengthInDestinationMeasureUnit =
                        lengthInMeters * 0.001 ;
                break;
            case "ft":
                lengthInDestinationMeasureUnit =
                        lengthInMeters * 3.2808399;
                break;
            case "yd":
                lengthInDestinationMeasureUnit =
                        lengthInMeters * 1.0936133;
                break;
        }

        System.out.printf("%f %s",
                lengthInDestinationMeasureUnit,
                destinationMeasureUnit);
    }
}
