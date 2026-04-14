import java.util.Scanner; 

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); // take index of an array 
        int [] array = new int[N] ; // declare array
        for(int i=0 ; i < N ; i++ ){
            array[i] = sc.nextInt() ;
        }
        System.out.println("Original Array : " ); 

        for(int i=0 ; i < N ; i++ ){
            


            System.out.print(array[i] + " "  );
        }
        System.out.println();
        System.out.println("After modifying : "); 
        for(int i=0 ; i < N ; i++ ){
            

            
            if(array[i] < 0){
                array[i] = 0 ;
            }
            else if(array[i] > 0){
                array[i] = 1 ; 
            }
            System.out.print(array[i] + " ");
        }


    }
     
    
}
