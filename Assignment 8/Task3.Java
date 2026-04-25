import java.util.Scanner;

public class Task3 {

    // A. Tax calculator
    public static double calcTax(int age, double salaryy){

        if(age < 18){
            return 0;
        }

        if(salaryy < 10000){
            return 0;
        }

        if(salaryy <= 20000){
            return salaryy * 0.07;
        }

        return salaryy * 0.14;
    }

   
    public static void calcYearlyTax(){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double totalTax = 0;

        for(int i = 1; i <= 12; i++){
            double income = sc.nextDouble();



            double tax = calcTax(age, income); 


            System.out.println("Month" + i + " tax: " + tax);

            totalTax += tax;
        }


        //print
        System.out.println("Total Yearly Tax: " + totalTax);
    }

    // method call eikhane 
    public static void main(String[] args){
        calcYearlyTax();
    }
}