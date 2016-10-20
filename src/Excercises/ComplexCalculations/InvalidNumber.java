package Excercises.ComplexCalculations;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double number = Double.parseDouble(
                console.nextLine());

        boolean isInvalid = number != 0 &&
                (number < 100 || number > 200);

        if (isInvalid) {
            System.out.println("invalid");
        }
    }
}
