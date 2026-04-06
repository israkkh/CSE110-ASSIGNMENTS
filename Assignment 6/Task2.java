// step 1 find all vowels from string 
// reverse that vowel 
// loop through that string again 
// if that string is a vowel , replace it from the first index of the 
// REVIEW THIS , bit complicated  // 

import java.util.Scanner;

public class Task2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        String vowels = "" ;
        String rev = "" ;
        String newstring = "" ;
        int index = 0 ; 

        for(int i = 0 ; i < s.length() ; i ++ ){
            char c = s.charAt(i) ;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'|| c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                vowels += s.charAt(i) ;

            }


        }
        // reverse vowels 
        for(int i = vowels.length() - 1 ; i >= 0 ; i-- ){
            rev += vowels.charAt(i);
        }


        // loop again , if vowel , replace them 
        for(int i = 0 ; i < s.length() ; i ++ ){
            char c = s.charAt(i) ;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'|| c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                c = rev.charAt(index);
                index ++ ; 

                newstring += c ;


       

            }
            else {
                newstring += c ;
            } 
        }
        System.out.println(newstring);
            


     }

}
