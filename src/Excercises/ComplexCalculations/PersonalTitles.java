package Excercises.ComplexCalculations;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double age = Double.parseDouble(console.nextLine());
        String gender = console.nextLine();

        boolean isMale = gender.equals("m");
        boolean isFemale = gender.equals("f");
        boolean isYoungerThanSixteen = age < 16;

        if (isMale) {
            if (isYoungerThanSixteen) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        } else if (isFemale) {
            if (isYoungerThanSixteen) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        }
    }

}
