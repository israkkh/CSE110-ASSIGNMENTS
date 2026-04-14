import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalRows = 2 * n - 1;

        for (int i = 1; i <= totalRows; i++) {
            int spaces, digits;

            if (i <= n) {
                spaces = n - i;
                
                digits = 2 * i - 1;
            } else {
                spaces = i - n;

                digits = 2 * (totalRows - i + 1) - 1;
            }





            
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");


            }

            if (digits == 1) {

                
                System.out.print(1);
            } else {
               



                System.out.print(1);

                for (int s = 0; s < digits - 2; s++) {
                    System.out.print(" ");
                }
                System.out.print(digits);
            }

            System.out.println();
        }
    }
}