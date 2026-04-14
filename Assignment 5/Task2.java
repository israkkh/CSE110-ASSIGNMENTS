import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.print(n);
            }

            else if (i == 2) {
                System.out.print(n-1);
                System.out.print(n);
            }

            else if (i == n) {
                for (int d = 1; d <= n; d++) {
                    System.out.print(d);
                }
            }

            else {
                System.out.print(n - i + 1);

                for (int s = 0; s < 2*i - 3; s++) {
                    System.out.print(" ");
                }

                System.out.print(n);
            }

            System.out.println();
        }
    }
}