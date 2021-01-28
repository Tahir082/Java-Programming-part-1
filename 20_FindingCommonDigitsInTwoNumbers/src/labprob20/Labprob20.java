
package labprob20;

import java.util.Scanner;


public class Labprob20 {

    
    public static void main(String[] args) {
        int a, b, count=0;
        boolean result;
        Scanner input= new Scanner(System.in);
        while(true){
            System.out.println("Type in 1st Number: ");
            a= input.nextInt();
            System.out.println("Type in 2nd Number: ");
            b= input.nextInt();
            if(a>=25 && a<=75 && b>=25 && b<=75)
            {
    
                break;
            }
            else{
                System.out.println("Invalid input!!! Type numbers between 25 and 75");
            }
        }
        
        int a_rem=0, b_rem=0;
        
        while(a!=0 || b!=0){
            int a_digit=0, b_digit=0;
            a_rem= a%10;
            a_digit= a_digit+ a_rem;
            a= a/10;
            
            b_rem= b%10;
            b_digit= b_digit+ b_rem;
            b= b/10;
            
            if(a_digit==b_digit)
            {
                count++;
            }
            
        }
        if(count!=0){
            result=true;
            System.out.println("One or more digits are common in both numbers.");
            System.out.println("So, the result is: " +result);
        }
        else{
            result=false;
            System.out.println("No digit found common in both numbers.");
            System.out.println("So, the result is: " +result);
        }
        
    }
    
}
