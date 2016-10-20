package Excercises.ComplexCalculations;

import java.util.Scanner;

public class PointInTheFigure {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int blockSize = Integer.parseInt(
                console.nextLine());
        int pointToCheckX = Integer.parseInt(
                console.nextLine());
        int pointToCheckY = Integer.parseInt(
                console.nextLine());

        int lowerRectangleLowerLeftPointX = 0;
        int lowerRectangleLowerLeftPointY = 0;
        int lowerRectangleLowerRightPointX = 3 *
            blockSize;
        int lowerRectangleUpperLeftPointY =
            blockSize;

        boolean pointHorizontallyInsideLowerRectangle =
            lowerRectangleLowerLeftPointX < pointToCheckX &&
            pointToCheckX < lowerRectangleLowerRightPointX;
        boolean pointVerticallyInsideLowerRectangle =
            lowerRectangleLowerLeftPointY < pointToCheckY &&
            pointToCheckY < lowerRectangleUpperLeftPointY;
        boolean pointInsideLowerRectangle =
            pointHorizontallyInsideLowerRectangle &&
            pointVerticallyInsideLowerRectangle;

        boolean pointHorizontallyOutsideLowerRectangle =
            pointToCheckX < lowerRectangleLowerLeftPointX ||
            lowerRectangleLowerRightPointX < pointToCheckX;
        boolean pointVericallyOutsideLowerRectangle =
            pointToCheckY < lowerRectangleLowerLeftPointY ||
            lowerRectangleUpperLeftPointY < pointToCheckY;
        boolean pointOutsideLowerRectangle =
            pointHorizontallyOutsideLowerRectangle ||
            pointVericallyOutsideLowerRectangle;

        boolean pointOnBorderOfLowerRectangle =
            !pointInsideLowerRectangle && !pointOutsideLowerRectangle;

        int upperRectangleLowerLeftPointX = blockSize;
        int upperRectangleLowerLeftPointY = blockSize;

        int upperRectangleLowerRightPointX = 2 * blockSize;

        int upperRectangleUpperLeftPointY = 4 * blockSize;

        boolean pointHorizontallyInsideupperRectangle =
            upperRectangleLowerLeftPointX < pointToCheckX &&
            pointToCheckX < upperRectangleLowerRightPointX;
        boolean pointVerticallyInsideUpperRectangle =
            upperRectangleLowerLeftPointY < pointToCheckY &&
            pointToCheckY < upperRectangleUpperLeftPointY;
        boolean pointInsideUpperRectangle =
            pointHorizontallyInsideupperRectangle &&
            pointVerticallyInsideUpperRectangle;

        boolean pointHorizontallyOutsideUpperRectangle =
            pointToCheckX < upperRectangleLowerLeftPointX ||
            upperRectangleLowerRightPointX < pointToCheckX;
        boolean pointVerticallyOutsideUpperRectangle =
            pointToCheckY < upperRectangleLowerLeftPointY ||
            upperRectangleUpperLeftPointY < pointToCheckY;
        boolean pointOutsideUpperRectangle =
            pointHorizontallyOutsideUpperRectangle ||
            pointVerticallyOutsideUpperRectangle;

        boolean pointOnBorderOfUpperRectangle =
            !pointInsideUpperRectangle &&
            !pointOutsideUpperRectangle;

        boolean pointOnCommonSideOfRectangles =
            pointOnBorderOfLowerRectangle &&
            pointOnBorderOfUpperRectangle &&
            blockSize < pointToCheckX &&
            pointToCheckX < 2 * blockSize;

        boolean pointInsideFigure = pointInsideLowerRectangle ||
            pointInsideUpperRectangle ||
            pointOnCommonSideOfRectangles;
        boolean pointOutsideFigure =
            pointOutsideLowerRectangle &&
            pointOutsideUpperRectangle;

        if (pointInsideFigure) {
            System.out.println("inside");
        } else if (pointOutsideFigure) {
            System.out.println("outside");
        } else {
            System.out.println("border");
        }
    }
}
