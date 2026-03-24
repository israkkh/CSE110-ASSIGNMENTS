
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int numdays = sc.nextInt();
        String string1 = "";
        for(int i = 1 ; i <= numdays ; i++ ){
            System.out.println("Enter sales for Day " + i + ":");
            double sum = 0 ; 
            //nested loop to take 3 salew inputs
            for(int j = 1 ; j <= 3 ; j++){
                int sales = sc.nextInt();
                sum = sum + sales ;

            }
            // if conditions
            if(sum >= 500 ){
                sum = sum + sum*0.1 ;
                 

            }
            else if(sum >= 200){
                sum = sum + sum*0.05 ;
               

            }
            else if(sum >= 100){
                sum = sum + sum*0.02 ;
                
                

            }
            else{
                sum = sum ; 
                
            }
            string1 += "Day " + i + ": Total Sales with Tax: " + sum + System.lineSeparator(); // line seperator adds a new line 
            
            

        }

        System.out.println(string1);
        

    }

}
