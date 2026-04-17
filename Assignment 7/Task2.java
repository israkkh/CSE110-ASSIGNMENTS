import java.util.Scanner ; 
public class Task2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); // take index of an array  
        boolean flag = false ; 
        int [] array = new int[N] ; // declare array  
       
        int temp = 0 ;
        for(int i=0 ; i < N ; i++ ){
            System.out.println("Please enter a number"); 
            array[i] = sc.nextInt();
            



        }

        System.out.println("Please enter another number");
        int N2 = sc.nextInt(); 
        for(int i = 0 ; i < N ; i++ ){
            if(array[i] == N2){
                flag = true;
                temp = i ;
                break;
            }
        }
        if(flag==true){
            System.out.println(N2 + " is at index " + temp);
        
        }
        else{
            System.out.println("Element not found");
        }
    }
}
