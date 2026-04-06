
import java.util.Scanner;

public class Task4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().toLowerCase();
        int madrid = 0;
        int city = 0;


        int index = string.indexOf("madrid");

        while (index != -1) {
            madrid++;
            index = string.indexOf("madrid", index + 1);   // search again 
        }

        int index2 = string.indexOf("city");

        while (index2 != -1) {
            city++;
            index2 = string.indexOf("city", index2 + 1);   // search again 
        }

        if(madrid>city){
            System.out.println("Madrid Supporter");
        }
        else if(city>madrid){
             System.out.println("City Supporter"); }
        else{
            System.out.println("Neutral");
        }
        if(string.contains("close")){
            System.out.println("Fan expect a close match");

        }
        else if(string.contains("destroy")){
            System.out.println("Fan expects a dominating victory!");
            
        }
        else{
            System.out.println("Hard to read the fan sentiment");

        }

    }

}
