package SimpleCalculations;

import java.util.Scanner;

public class RadiansToDegreesConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double radians = Double.parseDouble(
                console.nextLine());

        double degrees = Math.round(
                radians * 180 / Math.PI);

        System.out.println(degrees);
    }
}
