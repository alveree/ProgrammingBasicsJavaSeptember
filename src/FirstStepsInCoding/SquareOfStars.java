package FirstStepsInCoding;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(
                System.in);

        int squareSize = Integer.parseInt(
                console.nextLine());

       for (int i = 0; i < squareSize; i++) {
           System.out.print("*");
       }
       System.out.println();

       for (int i = 0; i < squareSize - 2; i++) {
           System.out.print("*");
           for (int j = 0; j < squareSize - 2; j++) {
               System.out.print(" ");
           }
           System.out.println("*");
       }

       for (int i = 0; i < squareSize; i++) {
           System.out.print("*");
       }
       System.out.println();
    }
}
