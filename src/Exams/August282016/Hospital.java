package Exams.August282016;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int periodInDays = Integer.parseInt(
                console.nextLine());

        int treatedPatients = 0;
        int untreatedPatients = 0;
        int numberOfDoctors = 7;

        for (int day = 1; day <= periodInDays; day++) {
            int patientsPerDay = Integer.parseInt(
                    console.nextLine());

            if (day % 3 == 0
                    && treatedPatients < untreatedPatients) {
                numberOfDoctors++;
            }

            int treatedPatientsPerDay;
            if (patientsPerDay < numberOfDoctors) {
                treatedPatientsPerDay = patientsPerDay;
            } else {
                treatedPatientsPerDay = numberOfDoctors;
            }

            int untreatedPatientsPerDay =
                    patientsPerDay - treatedPatientsPerDay;

            treatedPatients += treatedPatientsPerDay;
            untreatedPatients += untreatedPatientsPerDay;
        }

        System.out.printf("Treated patients: %d.\n",
                treatedPatients);
        System.out.printf("Untreated patients: %d.\n",
                untreatedPatients);
    }
}
