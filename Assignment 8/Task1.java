import java.util.Scanner;

public class Task1 {

    
    public static boolean isprime(int n1){
        if(n1 <= 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n1); i++){
            if(n1 % i == 0){
                return false;
            }

        }
        return true;





    }



    public static boolean isperfect(int n){
        if(n <= 0){


            return false;
        }

        int sum = 0;

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum += i;
            }
        }

        return sum == n;
    }


    public static int special_sum(int nambar){
        int sum = 0;

        for(int i = 1; i <= nambar; i++){
            if(isprime(i) || isperfect(i)){   // call the methods
                sum += i;
            }
        }

        return sum;
        
    }
     public static void main(String[] args){


        Scanner sc = new Scanner(System.in);



        int n = sc.nextInt();   // taking user input 

        int result = special_sum(n);
        System.out.println(result);
        
    }

   
}