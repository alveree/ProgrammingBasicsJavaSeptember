package Exams.August282016;

import java.util.Scanner;

public class Axe {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int axeSize = Integer.parseInt(
                console.nextLine());

        //liawo 3 * n tireta
        // sreda - *m tireta*
        //diasno - 2 * n - 2 tireta

        //Upper Part
        int numberOfRightHyphens = 2 * axeSize - 2;
        for (int row = 0; row < axeSize; row++) {
            System.out.printf("%s*%s*%s\n",
                    repeatString('-', 3 * axeSize),
                    repeatString('-', row),
                    repeatString('-', numberOfRightHyphens));
            numberOfRightHyphens--;
        }

        //Middle Part
        String stars = repeatString('*', 3 * axeSize + 1);
        String hyphens = repeatString('-', axeSize - 1);

        for (int row = 0; row < axeSize / 2; row++) {
            System.out.printf("%s%s*%s\n",
                    stars,
                    hyphens,
                    hyphens);
        }

        //Lower Part
        int leftHyphensCount = 3 * axeSize;
        int innerHyphensCount = axeSize - 1;
        int rightHyphensCount = axeSize - 1;


        for (int row = 0; row < axeSize / 2 - 1; row++) {
            String leftHyphens = repeatString('-', leftHyphensCount);
            String innerHyphens = repeatString('-', innerHyphensCount);
            String rightHyphens = repeatString('-', rightHyphensCount);

            System.out.printf("%s*%s*%s\n",
                    leftHyphens,
                    innerHyphens,
                    rightHyphens);

            leftHyphensCount--;
            rightHyphensCount--;
            innerHyphensCount += 2;
        }

        //Bottom
        int rightHyphensCountBottom =
                axeSize / 2 + axeSize % 2;
        int starsCountBottom =
                2 * axeSize - (axeSize % 2 + 1);
        int leftHyphensCountBottom = 5 * axeSize -
                (rightHyphensCountBottom + starsCountBottom);

        System.out.printf("%s%s%s",
                repeatString('-', leftHyphensCountBottom),
                repeatString('*', starsCountBottom),
                repeatString('-', rightHyphensCountBottom));
    }

    private static String repeatString(char symbol,
                                       int times) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            builder.append(symbol);
        }

        return builder.toString();
    }
}
