// 3 herbs 2 crystal , increment by 3 and 2? 
import java.util.Scanner;
public class Task2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); //takin input 

        System.out.println("Please Enter number of Herbs (H)"); // output msg
        int Herbs = sc.nextInt();

        System.out.println("Please Enter number of Crystals (C)");
        int Crystals = sc.nextInt();
        

        for(int p = 1; Herbs >= 3 && Crystals >= 2; p++){ // initialization , condition , update // 
            Herbs -= 3; // decrement herbs by 3 every creation 
            Crystals -= 2; 
            if ( Herbs >= 0 && Crystals >= 0 ){
                
                System.out.println("Potion-" + p + " created");
                System.out.println("Remaining Herbs: " + Herbs + ",Remaining Crystals:" + Crystals);
                
            }
            if(p % 2 == 0 ){
                System.out.println("Stable Elixir");
                


            }
            else{
                System.out.println("Volatile Brew");
            }
            System.out.println("potions created:" + p );    
            
            




        }
        

        
    }
}