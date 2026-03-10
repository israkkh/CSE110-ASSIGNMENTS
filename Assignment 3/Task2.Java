// 3 herbs 2 crystal , increment by 3 and 2? 
import java.util.Scanner;
public class Task2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); //takin input 

        System.out.println("Please Enter number of Herbs (H)"); // output msg
        int Herbs = sc.nextInt();

        System.out.println("Please Enter number of Crystals (C)");
        int Crystals = sc.nextInt();
        int p = 0 ;

        for(int h = 3 , c = 2 ; Herbs >= 0 && Crystals >= 0 ; h += 3, c += 2 ){ // initialization , condition , update 
            Herbs -= 3; // decrement herbs by 3 every creation 
            Crystals -= 2; 
            if ( Herbs >= 0 && Crystals >= 0 ){
                p++ ;
                System.out.println("Potion-" + p + " created");
                System.out.println("Remaining Herbs: " + Herbs + ",Remaining Crystals:" + Crystals);
                
            }
            System.out.println("potions created:" + p );    
            
            




        }
        

        
    }
}