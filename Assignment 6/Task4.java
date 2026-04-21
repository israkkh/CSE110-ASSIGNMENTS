import java.util.Scanner;

public class Task4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int madrid = 0;
        int bayern = 0;

        String temp = "";
        for(int i = 0 ; i < string.length() ; i++){
            char ch = string.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + 32);
            }
            temp = temp + ch;
        }
        string = temp;

        for(int i = 0 ; i <= string.length() - 6 ; i++){
            if(string.charAt(i)=='m' && string.charAt(i+1)=='a' && string.charAt(i+2)=='d' && string.charAt(i+3)=='r' && string.charAt(i+4)=='i' && string.charAt(i+5)=='d'){
                madrid++;
            }
        }

        for(int i = 0 ; i <= string.length() - 6 ; i++){
            if(string.charAt(i)=='b' && string.charAt(i+1)=='a' && string.charAt(i+2)=='y' && string.charAt(i+3)=='e' && string.charAt(i+4)=='r' && string.charAt(i+5)=='n'){
                bayern++;
            }
        }

        if(madrid>bayern){
            System.out.println("Madrid Supporter");
        }
        else if(bayern>madrid){
             System.out.println("Bayern Supporter"); }
        else{
            System.out.println("Neutral");
        }

        boolean hasClose = false;
        for(int i = 0 ; i <= string.length() - 5 ; i++){
            if(string.charAt(i)=='c' && string.charAt(i+1)=='l' && string.charAt(i+2)=='o' && string.charAt(i+3)=='s' && string.charAt(i+4)=='e'){
                hasClose = true;
            }
        }

        boolean hasDestroy = false;
        for(int i = 0 ; i <= string.length() - 7 ; i++){
            if(string.charAt(i)=='d' && string.charAt(i+1)=='e' && string.charAt(i+2)=='s' && string.charAt(i+3)=='t' && string.charAt(i+4)=='r' && string.charAt(i+5)=='o' && string.charAt(i+6)=='y'){
                hasDestroy = true;
            }
        }

        if(hasClose){
            System.out.println("Fan expect a close match");

        }
        else if(hasDestroy){
            System.out.println("Fan expects a dominating victory!");
            
        }
        else{
            System.out.println("Hard to read the fan sentiment");

        }

    }

}