package Excercises.SimpleCalculations;

import java.util.Scanner;

public class TwoDRectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double lowerLeftPointXCoordinate = Double.parseDouble(
                console.nextLine());
        double lowerLeftPointYCoordinate = Double.parseDouble(
                console.nextLine());
        double upperRightPointXCoordinate = Double.parseDouble(
                console.nextLine());
        double upperRightPointYCoordinate = Double.parseDouble(
                console.nextLine());

        double width = Math.abs(lowerLeftPointXCoordinate -
                upperRightPointXCoordinate);
        double height = Math.abs(lowerLeftPointYCoordinate -
                upperRightPointYCoordinate);
        double perimeter = 2 * (width + height);
        double area = width * height;

        System.out.println(area);
        System.out.println(perimeter);
    }
}

