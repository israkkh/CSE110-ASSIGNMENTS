import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rows = 2 * n - 1;

         

        for (int i = 1; i <= rows; i++) {

            int spaces;
            int numbers;

            if (i <= n) {
                spaces = i - 1;
                numbers = n - i + 1;
            } 
            else {


                spaces = rows - i;
                numbers = i - n + 1;
            }

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= numbers; j++) {
                System.out.print(j);
            }



            for (int j = numbers - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}