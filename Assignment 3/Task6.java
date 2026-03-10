import java.util.Scanner; 



public class Task6 {
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter an integr");
        boolean prime = true ;  
        int input = sc.nextInt();
        // checckin prime number 
        if(input <= 1){
           prime = false;
        }
        else{
            for (int i = 2; i < input; i++) {  // check from 2 to input-1
                if (input % i == 0) {
                    prime = false;
                }
        }
        if(prime == true){
            System.out.println(input + " is  a prime number");
        }
        else{
            System.out.println(input + " is not a prime number");
        }
        // check perfect number 
        int sum = 0 ;
        for (int i = 1 ; i < input ; i++){
            if( input % i == 0 ){  // if  number divisor and take sum of the divisors
                sum += i;

            }
        }
        if (sum==input){
            System.out.println(input + " is a perfect number");

        }
        else{
            System.out.println(input + " is not a perfect number");

        }

    }
        



    }
}
