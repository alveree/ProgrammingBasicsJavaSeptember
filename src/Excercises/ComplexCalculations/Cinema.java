package Excercises.ComplexCalculations;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String projectionType = console.nextLine();
        int numberOfRows = Integer.parseInt(
                console.nextLine());
        int numberOfColumns = Integer.parseInt(
                console.nextLine());

        int numberOfSeats = numberOfRows *
                numberOfColumns;

        double totalIncomeForFullHall = 0;
        switch (projectionType) {
            case "Premiere":
                totalIncomeForFullHall =
                    12 * numberOfSeats;
                break;
            case "Normal":
                totalIncomeForFullHall =
                    7.5 * numberOfSeats;
                break;
            case "Discount":
                totalIncomeForFullHall =
                    5 * numberOfSeats;
                break;
        }

        System.out.printf("%.2f", totalIncomeForFullHall);
    }
}
