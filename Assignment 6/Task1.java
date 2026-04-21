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

        String temp = "";
        for(int j = 0 ; j < s.length() ; j++){
            char ch = s.charAt(j);
            if(ch != ' '){
                temp = temp + ch;
            }
        }
        s = temp; // remove white space

        for(int i = 0 ; i < s.length() - 1 ; i++ ){ // must end before so no out of bounds
            char c = s.charAt(i) ;
            char cplus1 = s.charAt(i+1) ;
            if (c >= '0' && c <= '9' && cplus1 >= '0' && cplus1 <= '9' ){
                String newdigitstring = "" + c + cplus1 ;
                int newdigitint = (c - '0') * 10 + (cplus1 - '0');
                if (newdigitint > digitreturned){
                    digitreturned = newdigitint ;
                }
            }
        }

        System.out.println("2-Digit Pin : " +  digitreturned);
    }
}