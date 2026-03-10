import java.util.Scanner; 
public class Task8 {
    public static void main(String args[]){
        System.out.println("please enter an integr");
        Scanner sc = new Scanner(System.in);
        int inputnum = sc.nextInt();
        int nonnegative = 0;
        int negative = 0 ; 
        for(int i = 0 ; i < inputnum ; i++){ // initialization condition update\
            
            System.out.println("please enter an integr");
            int numloop = sc.nextInt();
            if (numloop < 0){
                negative++ ;

            }
            else{
                nonnegative++;
            }

        

        }
       System.out.println( nonnegative + " Non-negative Numbers");
       System.out.println( negative + " negative Numbers");

    }

    
}
