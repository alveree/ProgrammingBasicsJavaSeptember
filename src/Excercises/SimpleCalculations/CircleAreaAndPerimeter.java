package Excercises.SimpleCalculations;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double radius = Double.parseDouble(
                console.nextLine());

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Area = %f%sPerimeter = %f",
                area, "\n", perimeter);
    }
}
