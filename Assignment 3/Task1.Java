import java.util.Scanner;

public class Task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myinput = sc.nextInt(); // take input 
        for(int i = 0; i <= myinput ; i++  ){    //initialization , condition , update
            if(i % 5 == 0 && i % 3 != 0 ){
                System.out.println(i); //print num if condition tru

            }
            
        }

        

        
    }
}