import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Energy (E) - ");
        int energy = sc.nextInt();
        System.out.println("No of rivers (N) - ");
        int N = sc.nextInt(); //takin all the inputs here

        int stopriver = 0; // store where pokemon stops eikhane 

        for(int i = 1 ; i <=N; i++ ){ // for loop until amount of rivers 
            System.out.print("Enter River Distance D" + i + ":"); 
            int D = sc.nextInt();
            int cost = 0 ; 
            if(D <= 5){
                cost = 2;  // if d less than 5 then it will cost 2 as mentioned on the ques
            }
            else{
                cost = D / 2 ; 
            }
            energy = energy - cost ;     

            if (energy < 0 && stopriver == 0){
                stopriver = i; // note the point where i 
            }
        }

        if (stopriver > 0 )
        {
            System.out.println("tired at River " + stopriver );
        }
        else{
            System.out.println("All done") ;
            System.out.println( energy + " energy left " ) ; 
        }
    }
}