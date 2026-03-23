import java.util.Scanner;

public class Task2 {
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of students" );
    int numstudent = sc.nextInt();
    for(int i = 1;i<=numstudent;i++){
        
        System.out.println("Enter student ID:");
        int studentid = sc.nextInt();

        if (studentid > 0 && (studentid & (studentid - 1)) == 0) { // logic dfor finding POWER of 2 
            System.out.println("Lucky ID");
        } 
        
        else {
            System.out.println("Not lucky");
        }
    }
   }
    
}


