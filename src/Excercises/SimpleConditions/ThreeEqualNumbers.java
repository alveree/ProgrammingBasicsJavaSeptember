package Excercises.SimpleConditions;

import java.util.Scanner;

public class ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double firstNumber = Double.parseDouble(
                console.nextLine());
        double secondNumber = Double.parseDouble(
                console.nextLine());
        double thirdNumber = Double.parseDouble(
                console.nextLine());

        if (firstNumber == secondNumber &&
                secondNumber == thirdNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
