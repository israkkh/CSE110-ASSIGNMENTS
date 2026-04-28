import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Please enter the elements of the arr1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Array 2 input
        System.out.print("Please enter the length of array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Please enter the elements of the arr2:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean flag = true;

        for (int i = 0; i < n2; i++) {
            boolean found = false;

            for (int j = 0; j < n1; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                flag = false;
                break;
            }
        }

        // Output result
        if (flag) {
            System.out.println("Array 2 is a subset of Array 1.");
        } else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }

    }
}
