package SimpleCalculations;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("a = ");
        int side = Integer.parseInt(
                console.nextLine());

        int area = side * side;

        System.out.printf("Square area = %d", area);
    }
}
