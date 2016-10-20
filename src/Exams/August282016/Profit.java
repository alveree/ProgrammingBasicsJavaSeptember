package Exams.August282016;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int workingDays = Integer.parseInt(
                console.nextLine());
        double dailyIncome = Double.parseDouble(
                console.nextLine());
        double dollarToBgnCourse = Double.parseDouble(
                console.nextLine());

        double salaryInDollars = workingDays *
                dailyIncome;
        double baseYearlyIncomeInDollars = 12 *
                salaryInDollars;
        double yearlyBonusInDollars = salaryInDollars * 2.5;
        double yearlyIncomeInDollars =
                baseYearlyIncomeInDollars +
                        yearlyBonusInDollars;
        double netYearlyIncomeInDollars = 0.75 *
                yearlyIncomeInDollars;

        double dailyIncomeInDollars =
                netYearlyIncomeInDollars / 365;
        double dailyIncomeInBgn = dailyIncomeInDollars *
                dollarToBgnCourse;

        System.out.printf("%.2f", dailyIncomeInBgn);
    }
}
