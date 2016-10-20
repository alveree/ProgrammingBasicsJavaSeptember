package Excercises.ComplexCalculations;

import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double upperLeftPointXCoordinate =
                Double.parseDouble(console.nextLine());
        double upperLeftPointYCoordinate =
                Double.parseDouble(console.nextLine());
        double lowerRightPointXCoordinate =
                Double.parseDouble(console.nextLine());
        double lowerRightPointYCoordinate =
                Double.parseDouble(console.nextLine());

        double pointToCheckXCoordinate =
                Double.parseDouble(console.nextLine());
        double pointToCheckYCoordinate =
                Double.parseDouble(console.nextLine());

        boolean isHorizontallyInsideRectangle =
                upperLeftPointXCoordinate <=
                    pointToCheckXCoordinate &&
                    pointToCheckXCoordinate <=
                    lowerRightPointXCoordinate;
        boolean isVericallyInsideRectangle =
                upperLeftPointYCoordinate <=
                    pointToCheckYCoordinate &&
                    pointToCheckYCoordinate <=
                    lowerRightPointYCoordinate;

        if (isHorizontallyInsideRectangle &&
                isVericallyInsideRectangle) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}
