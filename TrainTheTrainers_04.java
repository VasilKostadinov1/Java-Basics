package BASIC.NestedLoopsExercises;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        int counter = 0;
        double sum = 0;
        double gradeForPresentation=0;

        while (!presentation.equals("Finish")) {
            for (int i = 1; i <= n; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                sum += grades;
                gradeForPresentation+=grades;
                counter++;
            }

            double average = gradeForPresentation / n;
            System.out.printf("%s - %.2f.%n", presentation, average);
            gradeForPresentation=0;        // !!! нулираме броя4а преди да отидем на следваща лекция

            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", (double) sum / counter);
    }
}
