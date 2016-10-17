package Excercises.SimpleCalculations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ThousandDaysAfterBirth {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "dd-MM-yyyy");
        LocalDate birthdate = LocalDate.parse(console.nextLine(),
                formatter);

        LocalDate thousandDaysAfterBirthdate = birthdate.plusDays(999);

        System.out.println(formatter.format(thousandDaysAfterBirthdate));
    }
}
