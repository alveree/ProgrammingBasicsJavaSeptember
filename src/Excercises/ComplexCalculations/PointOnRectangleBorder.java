package Excercises.ComplexCalculations;

import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double upperLeftPointXCoordinate =
            Double.parseDouble(console.nextLine());
        double  upperLeftPointYCoordinate =
            Double.parseDouble(console.nextLine());
        double lowerRightPointXCoordinate =
            Double.parseDouble(console.nextLine());
        double lowerRightPointYCoordinate =
            Double.parseDouble(console.nextLine());

        double pointToCheckXCoordinate =
            Double.parseDouble(console.nextLine());
        double pointToCheckYCoordinate =
            Double.parseDouble(console.nextLine());

        boolean isOnHorizontalBorder =
                upperLeftPointXCoordinate <=
                pointToCheckXCoordinate &&
                pointToCheckXCoordinate <=
                lowerRightPointXCoordinate &&
                (pointToCheckYCoordinate == upperLeftPointYCoordinate
                || pointToCheckYCoordinate == lowerRightPointYCoordinate);

        boolean isOnVerticlaBorder =
                upperLeftPointYCoordinate <=
                pointToCheckYCoordinate &&
                pointToCheckYCoordinate <=
                lowerRightPointYCoordinate &&
                (pointToCheckXCoordinate == upperLeftPointXCoordinate
                || pointToCheckXCoordinate == lowerRightPointXCoordinate);

        boolean isOnBorder = isOnHorizontalBorder ||
                isOnVerticlaBorder;

        if (isOnBorder) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }


    }
}
