package Excercises.SimpleConditions;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double score = Double.parseDouble(console.nextLine());
        double bonusScore = 0;

        if (score <= 100) {
            bonusScore = 5;
        } else if (score > 100 && score <= 1000) {
            bonusScore = score / 5;
        } else if (score > 1000) {
            bonusScore = score / 10;
        }

        double additionalBonusScore = 0;

        if (score % 2 == 0) {
            additionalBonusScore = 1;
        }

        if (score % 10 == 5) {
            additionalBonusScore = 2;
        }

        double totalBonusScore = bonusScore + additionalBonusScore;

        System.out.println(totalBonusScore);
        System.out.println(totalBonusScore + score);
    }
}
