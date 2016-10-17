package Excercises.SimpleCalculations;


import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double inputCurrencyAmount = Double.parseDouble(
                console.nextLine());
        String inputCurrencyCode = console.nextLine();
        String outputCurrencyCode = console.nextLine();

        final double bgnInUsd = 1.79549;
        final double bgnInEur = 1.95583;
        final double bgnInGbp = 2.53406;
        final double gbpInEur = 0.77181;
        final double gbpInUsd = 0.70854;
        final double eurInUsd = 1.08930;

        double outputCurrencyAmount = Double.MIN_VALUE;

        if (inputCurrencyCode.equals("BGN")) {
            switch (outputCurrencyCode) {
                case "USD":
                    outputCurrencyAmount = inputCurrencyAmount /
                            bgnInUsd;
                    break;
                case "EUR":
                    outputCurrencyAmount = inputCurrencyAmount /
                            bgnInEur;
                    break;
                case "GBP":
                    outputCurrencyAmount = inputCurrencyAmount /
                            bgnInGbp;
                    break;
            }
        } else if (inputCurrencyCode.equals("EUR")) {
            switch (outputCurrencyCode) {
                case "BGN":
                    outputCurrencyAmount = inputCurrencyAmount *
                            bgnInEur;
                    break;
                case "USD":
                    outputCurrencyAmount = inputCurrencyAmount *
                            eurInUsd;
                    break;
                case "GBP":
                    outputCurrencyAmount = inputCurrencyAmount *
                            gbpInEur;
                    break;
            }
        } else if (inputCurrencyCode.equals("USD")) {
            switch (outputCurrencyCode) {
                case "BGN":
                    outputCurrencyAmount = inputCurrencyAmount *
                            bgnInUsd;
                    break;
                case "EUR":
                    outputCurrencyAmount = inputCurrencyAmount /
                            eurInUsd;
                    break;
                case "GBP":
                    outputCurrencyAmount = inputCurrencyAmount *
                            gbpInUsd;
                    break;
            }
        } else if (inputCurrencyCode.equals("GBP")) {
            switch (outputCurrencyCode) {
                case "BGN":
                    outputCurrencyAmount = inputCurrencyAmount /
                            bgnInGbp;
                    break;
                case "EUR":
                    outputCurrencyAmount = inputCurrencyAmount /
                            gbpInEur;
                    break;
                case "USD":
                    outputCurrencyAmount = inputCurrencyAmount /
                            gbpInUsd;
                    break;
            }
        }

        System.out.printf("%.2f %s", outputCurrencyAmount,
                outputCurrencyCode);
    }
}
