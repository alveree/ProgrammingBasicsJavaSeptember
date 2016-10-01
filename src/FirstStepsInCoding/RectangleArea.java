package FirstStepsInCoding;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(
                System.in);

        int firstSide = Integer.parseInt(
                console.nextLine());
        int secondSide = Integer.parseInt(
                console.nextLine());

        int rectangleArea = firstSide *
                secondSide;

        System.out.println(rectangleArea);
    }
}
