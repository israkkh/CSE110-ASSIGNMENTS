import java.util.Scanner;
public class Task1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting number") ;
        int start = sc.nextInt(); //starting number
        System.out.println("enter ending number") ;
        int end = sc.nextInt();  //ending number 
        for(int row = start ; row <= end ; row ++ ){
            int temp = row ;
            int count = 0 ;
            while(temp != 0){ //counting the power (how many digits it has)
                temp = temp / 10 ; 
                count = count + 1 ; // find total count 

            }
            temp = row ;
            double sum = 0 ;
            while(temp != 0){ 
                int digit = temp % 10 ; 
                sum = sum +  Math.pow(digit, count);
                temp = temp / 10 ; // extracting digits agen



            }
            if((int)sum == row){
                System.out.println("Since the sum equals the original number, " + row + " is an Armstrong number.") ;
            }
        }


    }
}
    