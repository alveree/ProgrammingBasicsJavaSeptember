package SimpleCalculations;

import java.util.Scanner;

public class USDToBGNConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double usdAmount = Double.parseDouble(
                console.nextLine());

        double bgnAmount = usdAmount * 1.79549;

        System.out.printf("%.2f BGN", bgnAmount);
    }
}
