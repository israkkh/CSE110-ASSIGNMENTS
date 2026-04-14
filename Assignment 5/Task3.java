
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int totalDigits = 2 * i - 1;

            // asdd space here
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.print(1);
            } else if (i == n) {
                for (int d = 1; d <= totalDigits; d++) {
                    System.out.print(d);
                }
            } else {
                System.out.print(1);
                for (int s = 0; s < totalDigits - 2; s++) {
                    System.out.print(" ");
                }
                System.out.print(totalDigits);
            }

            System.out.println();
        }
    }
}


