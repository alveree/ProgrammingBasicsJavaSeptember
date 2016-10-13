package SimpleCalculations;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter inches: ");
        double inches = Double.parseDouble(
                console.nextLine());

        double centimetersInInch = 2.54;

        double centimeters = inches * centimetersInInch;

        System.out.printf("%.2f", centimeters);
    }
}
