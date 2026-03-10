import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int lastremaining = sc.nextInt();
        while (lastremaining != 0  ){
            int rightmost = lastremaining % 10 ;
            lastremaining = lastremaining /10 ;
            if(lastremaining !=0 ){
                System.out.print(rightmost + ",") ;

            }
            else{
                System.out.print(rightmost) ;
            }

        }
        
    }
            
}
