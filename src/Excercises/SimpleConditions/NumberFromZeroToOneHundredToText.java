package Excercises.SimpleConditions;

import java.util.Scanner;

public class NumberFromZeroToOneHundredToText {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        if (number < 0 || number > 100) {
            System.out.println("invalid number");
        } else if (number >= 0 && number < 20) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number >= 20 && number < 100) {
            String firstWord = "";
            String secondWord = "";

            int remainder = number / 10;
            switch (remainder) {
                case 2:
                    firstWord = "Twenty";
                    break;
                case 3:
                    firstWord = "Thirty";
                    break;
                case 4:
                    firstWord = "Fourty";
                    break;
                case 5:
                    firstWord = "Fifty";
                    break;
                case 6:
                    firstWord = "Sixty";
                    break;
                case 7:
                    firstWord = "Seventy";
                    break;
                case 8:
                    firstWord = "Eighty";
                    break;
                case 9:
                    firstWord = "Ninety";
                    break;
            }

            int quotient = number % 10;
            switch (quotient) {
                case 1:
                    secondWord = "one";
                    break;
                case 2:
                    secondWord = "two";
                    break;
                case 3:
                    secondWord = "three";
                    break;
                case 4:
                    secondWord = "four";
                    break;
                case 5:
                    secondWord = "five";
                    break;
                case 6:
                    secondWord = "six";
                    break;
                case 7:
                    secondWord = "seven";
                    break;
                case 8:
                    secondWord = "eight";
                    break;
                case 9:
                    secondWord = "nine";
                    break;
            }

            String numberName = "";
            if (secondWord.equals("")) {
                numberName = firstWord;
            } else {
                numberName = firstWord + " " + secondWord;
            }

            System.out.println(numberName);
        } else if (number == 100) {
            System.out.println("One Hundred");
        }
    }
}
