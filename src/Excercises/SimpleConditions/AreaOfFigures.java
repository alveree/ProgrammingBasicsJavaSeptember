package Excercises.SimpleConditions;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String figureType = console.nextLine();

        double area = 0;
        switch (figureType) {
            case "square":
                double squareSide = Double.parseDouble(
                        console.nextLine());
                area = squareSide * squareSide;
                break;
            case "rectangle":
                double firstSide = Double.parseDouble(
                        console.nextLine());
                double secondSide = Double.parseDouble(
                        console.nextLine());
                area = firstSide * secondSide;
                break;
            case "circle":
                double radius = Double.parseDouble(
                        console.nextLine());
                area = Math.PI * radius * radius;
                break;
            case "triangle":
                double side = Double.parseDouble(
                        console.nextLine());
                double height = Double.parseDouble(
                        console.nextLine());
                area = side * height / 2;
                break;
        }

        System.out.printf("%.3f", area);
    }
}
