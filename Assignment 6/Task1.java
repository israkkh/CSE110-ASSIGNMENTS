import java.util.Scanner;
//step 1 take input
//step 2 index thru all characters using a forloop and char at
// use built in method is digit to check if they are 2 digits then exctract them 
// if new figit greater than digitreturned then update it 

public class Task1 {
    public static void main(String args[]){
        System.out.println("Please enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int digitreturned = 0 ; 



        s = s.trim(); // remove white space 
        for(int i = 0 ; i < s.length() - 1 ; i++ ){ // must end before so no out of bounds
            char c = s.charAt(i) ; 
            char cplus1 = s.charAt(i+1) ; 
            if (Character.isDigit(c) == true && Character.isDigit(cplus1) == true ){
                String newdigitstring = "" + c + cplus1 ;
                int newdigitint = Integer.parseInt(newdigitstring); 
                if (newdigitint > digitreturned){
                    digitreturned = newdigitint ;
                }


            }

        }
        System.out.println("2-Digit Pin : " +  digitreturned);



    }
}
