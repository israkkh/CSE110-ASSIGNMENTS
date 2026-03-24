
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Members: ");
        int nummembers = sc.nextInt();
        String string1 = "";
        for (int i = 1; i <= nummembers; i++) {
            System.out.println("Exercises for Member- " + i + ":");

            int numexc = sc.nextInt();
            double sum = 0;
            double rawsum = 0;
            boolean flag = true; // adding a flag to check if all the calories is not more than 200
            // nested loop to take 3 salew inputs
            if (numexc > 3) {
                System.err.println("Cannot do more than 3 excercise");
                numexc = 3;
            }

            for (int j = 1; j <= numexc; j++) {
                System.out.println("Exercise - " + j + ":");

                double calories = sc.nextDouble();
                double bonus = 0;
                if (calories > 200) {
                    flag = false;

                }

                if (calories > 350) {

                    bonus = calories * 0.5;

                }
                sum = sum + calories + bonus;
                rawsum = rawsum + calories;

                

            }
            double avgrawsum = rawsum / numexc;

                if (avgrawsum < 500) {

                    double totalaverage = rawsum / numexc;
                    if (flag) {
                        totalaverage = totalaverage - totalaverage * 0.1;
                    }
                    System.out.println("Average calories earned per day for Member- " + i + ": " + totalaverage);

                }

                if (avgrawsum >= 500) {
                    sum = sum + 50 * numexc;
                    double totalaverage = sum / numexc;
                    System.out.println("Average calories earned per day for Member- " + i + ": " + totalaverage);

                }

        }

    }

}
