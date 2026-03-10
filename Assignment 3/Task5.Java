import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int count = 0 ;
        int inputdigit = sc.nextInt();
        int originalinput = inputdigit ; // so it doesnt become 0 after myy while loop
        while (inputdigit != 0  ){
            inputdigit = inputdigit /10 ;
            count ++ ; 
            

        }
        //divider logic here 
        int divider = 1 ; 
        for (int i =1 ; i<count; i++){
        
            divider = divider * 10 ; // multiply by count many times , count is the number of digits in the input 

        }
        // now print digits one by one
        int num = originalinput ; // brining the original input here 
        while(divider > 0 ){
            int digit = num/divider ; // get leftmost digit 
            System.out.print(digit);
            num = num % divider; // remove the leftmost digit
            divider = divider / 10;  //update divider 
            if (divider > 0) {
                System.out.print(","); //print a comma until da last digit.
            }
    

        }

       

    }
            
}
