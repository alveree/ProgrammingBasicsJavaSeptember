package SimpleCalculations;

import java.util.Scanner;

public class RightTriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double firstCathetus = Double.parseDouble(
                console.nextLine());
        double secondCathetus = Double.parseDouble(
                console.nextLine());

        double area = firstCathetus * secondCathetus / 2;

        System.out.printf("%.2f", area);
    }
}
