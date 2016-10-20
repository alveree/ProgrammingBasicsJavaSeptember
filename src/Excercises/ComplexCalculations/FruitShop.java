package Excercises.ComplexCalculations;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String fruit = console.nextLine()
                .toLowerCase();
        String dayOfWek = console.nextLine()
                .toLowerCase();
        double quantity = Double.parseDouble(
                console.nextLine());

        boolean isFruitInvalid =
                !fruit.equals("banana") &&
                !fruit.equals("apple") &&
                !fruit.equals("orange") &&
                !fruit.equals("grapefruit") &&
                !fruit.equals("kiwi") &&
                !fruit.equals("pineapple") &&
                !fruit.equals("grapes");

        if (isFruitInvalid) {
            System.out.println("error");
            return;
        }

        boolean isDayOfWeekInvalid =
                !dayOfWek.equals("monday") &&
                !dayOfWek.equals("tuesday") &&
                !dayOfWek.equals("wednesday") &&
                !dayOfWek.equals("thursday") &&
                !dayOfWek.equals("friday") &&
                !dayOfWek.equals("saturday") &&
                !dayOfWek.equals("sunday");

        if (isDayOfWeekInvalid) {
            System.out.println("error");
            return;
        }

        double finalPrice = 0;

        switch (dayOfWek) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                switch (fruit) {
                    case "banana":
                        finalPrice = 2.5 * quantity;
                        break;
                    case "apple":
                        finalPrice = 1.2 * quantity;
                        break;
                    case "orange":
                        finalPrice = 0.85 * quantity;
                        break;
                    case "grapefruit":
                        finalPrice = 1.45 * quantity;
                        break;
                    case "kiwi":
                        finalPrice = 2.7 * quantity;
                        break;
                    case "pineapple":
                        finalPrice = 5.5 * quantity;
                        break;
                    case "grapes":
                        finalPrice = 3.85 * quantity;
                        break;
                }
                break;
            case "saturday":
            case "sunday":
                switch (fruit) {
                    case "banana":
                        finalPrice = 2.7 * quantity;
                        break;
                    case "apple":
                        finalPrice = 1.25 * quantity;
                        break;
                    case "orange":
                        finalPrice = 0.9 * quantity;
                        break;
                    case "grapefruit":
                        finalPrice = 1.6 * quantity;
                        break;
                    case "kiwi":
                        finalPrice = 3 * quantity;
                        break;
                    case "pineapple":
                        finalPrice = 5.6 * quantity;
                        break;
                    case "grapes":
                        finalPrice = 4.2 * quantity;
                        break;

                }
                break;
        }

        System.out.println(finalPrice);
    }
}
