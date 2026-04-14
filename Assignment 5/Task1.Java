 import java.util.Scanner; 
 public class Task1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rowtotal = 2 * n - 1 ;
        for (int i = 1 ; i <= rowtotal ; i++ ){
            int spaces, digits;
            if (i<= n){
                spaces = n - i ; 
                digits = 2 * i - 1 ;

            }
            else {
                spaces = i - n ;
                digits = 2 * ( rowtotal - i + 1 ) -1 ; 

            }
            // print spaces 
            for (int s = 0 ; s < spaces ; s++){
                System.out.print(" ") ; 
            }
            for(int j = 1 ; j <= digits ; j++){
                System.out.print(j);
            }
            
            
            System.out.println();



        }
    }
 }