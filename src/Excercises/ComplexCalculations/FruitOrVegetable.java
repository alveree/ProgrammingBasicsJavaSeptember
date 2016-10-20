package Excercises.ComplexCalculations;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String productName = console.nextLine();

        boolean isFruit = productName.equals("banana")
                || productName.equals("apple")
                || productName.equals("kiwi")
                || productName.equals("cherry")
                || productName.equals("lemon")
                || productName.equals("grapes");
        boolean isVegetable = productName.equals("tomato")
                || productName.equals("cucumber")
                || productName.equals("pepper")
                || productName.equals("carrot");

        if (isFruit) {
            System.out.println("fruit");
        } else if (isVegetable) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
