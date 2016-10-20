package Exams.August282016;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int neededHoursToCompleteProject = Integer
            .parseInt(console.nextLine());
        int daysAvailableToCompleteProject = Integer
            .parseInt(console.nextLine());
        int employeesWorkingOvertime = Integer
            .parseInt(console.nextLine());

        int workingHoursAvailableToCompleteProject = 8 *
            daysAvailableToCompleteProject;
        double actualWorkingHoursAvailableToCompleteProject =
            0.9 * workingHoursAvailableToCompleteProject;
        int totalProjectOvertime = employeesWorkingOvertime *
            daysAvailableToCompleteProject *
            2;

        int totalProjectWorkingHours = (int)
            (actualWorkingHoursAvailableToCompleteProject +
            totalProjectOvertime);

        int hoursDifference = Math.abs(
                totalProjectWorkingHours -
                neededHoursToCompleteProject);

        if (neededHoursToCompleteProject <= totalProjectWorkingHours)  {
            System.out.printf("Yes!%d hours left.",
                hoursDifference);
        } else {
            System.out.printf("Not enough time!%d hours needed.",
                hoursDifference);
        }
    }
}
