package Excercises.SimpleCalculations;

import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double lowerBase = Double.parseDouble(
                console.nextLine());
        double upperBase = Double.parseDouble(
                console.nextLine());
        double height = Double.parseDouble(
                console.nextLine());

        double area = (upperBase + lowerBase) *
                height / 2;

        System.out.println(area);
    }
}
