
package labprob18;

import java.util.Scanner;


public class LabProb18 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Type in 1st Number: ");
        int a= input.nextInt();
        System.out.println("Type in 2nd Number: ");
        int b= input.nextInt();
        System.out.println("Type in 3rd Number: ");
        int c= input.nextInt();
        boolean result;
        if(c==a+b){
            result=true;
            System.out.println("The addition of 1st and 2nd number is equal to the third number.");
            System.out.println("So, the result is: " +result);
        }
        else{
            result= false;
            System.out.println("The addition of 1st and 2nd number is not equal to the third number.");
            System.out.println("So, the result is: " +result);
        }
        
    }
    
}
