package Excercises.ComplexCalculations;

import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String town = console.nextLine();
        double numberOfSales = Double.parseDouble(
                console.nextLine());

        boolean isTownInvalid =
                !town.equals("Sofia") &&
                !town.equals("Plovdiv") &&
                !town.equals("Varna");

        if (isTownInvalid) {
            System.out.println("error");
            return;
        }

        boolean isNumberOfSalesInvalid =
                    numberOfSales < 0;

        if (isNumberOfSalesInvalid) {
            System.out.println("error");
            return;
        }

        double commissionRating = 0;
        boolean areSalesLessThanOrEqualToFiveHubndred =
                0 <= numberOfSales &&
                numberOfSales <= 500;
        boolean areSaleBetweenFiveHundredAndThousandInclusive =
                500 < numberOfSales &&
                numberOfSales <= 1000;
        boolean areSalesBetweenThousandAndTenThousandInclusive =
                1000 < numberOfSales &&
                numberOfSales <= 10000;

        switch (town) {
            case "Sofia":
                if (areSalesLessThanOrEqualToFiveHubndred) {
                    commissionRating = 0.05;
                } else if (areSaleBetweenFiveHundredAndThousandInclusive) {
                    commissionRating = 0.07;
                } else if (areSalesBetweenThousandAndTenThousandInclusive) {
                    commissionRating = 0.08;
                } else {
                    commissionRating = 0.12;
                }
                break;
            case "Plovdiv":
                if (areSalesLessThanOrEqualToFiveHubndred) {
                    commissionRating = 0.055;
                } else if (areSaleBetweenFiveHundredAndThousandInclusive) {
                    commissionRating = 0.08;
                } else if (areSalesBetweenThousandAndTenThousandInclusive) {
                    commissionRating = 0.12;
                } else {
                    commissionRating = 0.145;
                }
                break;
            default:
                if (areSalesLessThanOrEqualToFiveHubndred) {
                    commissionRating = 0.045;
                } else if (areSaleBetweenFiveHundredAndThousandInclusive) {
                    commissionRating = 0.075;
                } else if (areSalesBetweenThousandAndTenThousandInclusive) {
                    commissionRating = 0.1;
                } else {
                    commissionRating = 0.13;
                }
                break;
        }

        double commissionValue = numberOfSales *
                commissionRating;

        System.out.printf("%.2f", commissionValue);
    }
}
