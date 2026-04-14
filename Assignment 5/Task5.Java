import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int d = 1; d <= i; d++) {
                System.out.print(d);



            }

            for (int d = i - 1; d >= 1; d--) {
                System.out.print(d);
            }


            System.out.println();
        }
    }
}