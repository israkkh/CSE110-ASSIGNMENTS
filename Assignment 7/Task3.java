import java.util.Scanner ; 
public class Task3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the length of the array: ");
        int N = sc.nextInt(); // take index of an array  
        boolean flag = false ; 
        double [] array = new double[N] ; // declare array  
        double max = -99999;
        double min = 99999;
        int minindex = 0 ; 
        int maxindex = 0 ; 
        double sum  = 0 ;
        double average = 0 ; 

       
        for(int i=0 ; i < N ; i++ ){
            System.out.println("Enter a number"); 
            array[i] = sc.nextDouble();
            



        }
        for(int i=0 ; i < N ; i++ ){
            if(array[i] >= max){
                max = array[i] ;
                maxindex = i ;

            }
            if(array[i] <= min){
                min = array[i] ;
                minindex = i ;

            }
            sum += array[i] ;
            



        }
        average = sum/N ;
        System.out.println("max element " + max + "found at index " + maxindex);
        System.out.println("min element " + min + "found at index " + minindex);
        System.out.println("Summation " + sum);
        System.out.println("Average " + average);


        
        
    }
}
