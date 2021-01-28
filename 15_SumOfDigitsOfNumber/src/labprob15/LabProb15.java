
package labprob15;

import java.util.Scanner;


public class LabProb15 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Type in a Number: ");
        int num= input.nextInt();
        int sum=0, r=0;
        while(num!=0){
            r= num%10;
            sum= sum+r;
            num=num/10;
            
        }
        
        System.out.println("Sum of the digits of given Number is: " +sum);
        
    }
    
}
