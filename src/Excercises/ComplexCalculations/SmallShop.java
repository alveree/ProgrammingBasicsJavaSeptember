package Excercises.ComplexCalculations;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String product = console.nextLine();
        String town = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());

        double finalPrice = 0;
        if (town.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    finalPrice = 0.5 * quantity;
                    break;
                case "water":
                    finalPrice = 0.8 * quantity;
                    break;
                case "beer":
                    finalPrice = 1.2 * quantity;
                    break;
                case "sweets":
                    finalPrice = 1.45 * quantity;
                    break;
                case "peanuts":
                    finalPrice = 1.6 * quantity;
                    break;
            }
        } else if (town.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    finalPrice = 0.4 * quantity;
                    break;
                case "water":
                    finalPrice = 0.7 * quantity;
                    break;
                case "beer":
                    finalPrice = 1.15 * quantity;
                    break;
                case "sweets":
                    finalPrice = 1.3 * quantity;
                    break;
                case "peanuts":
                    finalPrice = 1.5 * quantity;
                    break;
            }
        } else if (town.equals("Varna")) {
            switch (product) {
                case "coffee":
                    finalPrice = 0.45 * quantity;
                    break;
                case "water":
                    finalPrice = 0.7 * quantity;
                    break;
                case "beer":
                    finalPrice = 1.1 * quantity;
                    break;
                case "sweets":
                    finalPrice = 1.35 * quantity;
                    break;
                case "peanuts":
                    finalPrice = 1.55 * quantity;
                    break;
            }
        }

        System.out.println(finalPrice);
    }
}
