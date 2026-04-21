import java.util.Scanner;

public class Task5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int index = -1 ;

        for(int i = 0 ; i < string.length() ; i++){
            if(string.charAt(i) == ' '){
                index = i ;
            }
        }

        int count = string.length() - index - 1 ; 
        System.out.println(count) ; 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}