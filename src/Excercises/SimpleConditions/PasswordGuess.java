package Excercises.SimpleConditions;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        final String correctPassword = "s3cr3t!P@ssw0rd";
        String password = console.nextLine();

        if (password.equals(correctPassword)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
