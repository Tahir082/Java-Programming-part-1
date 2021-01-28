
package labprob13;

import java.util.Scanner;


public class LabProb13 {

   
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Type 1st number as A: ");
        double a= input.nextDouble();
        System.out.println("Type 2nd number as B: ");
        double b= input.nextDouble();
        System.out.println("Before Swap:");
        System.out.println("A= " +a);
        System.out.println("B= "+b);
        double temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap:");
        System.out.println("A= " +a);
        System.out.println("B= "+b);
        
        
    }
    
}
