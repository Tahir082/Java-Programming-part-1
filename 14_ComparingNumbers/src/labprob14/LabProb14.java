
package labprob14;

import java.util.Scanner;


public class LabProb14 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Type 1st number as A: ");
        double a= input.nextDouble();
        System.out.println("Type 2nd number as B: ");
        double b= input.nextDouble();
        if(a==b){
            System.out.println(a+ "=" +b);
        }
        if(a!=b){
            System.out.println(a+ "!=" +b);
        }
        if(a<b){
            System.out.println(a+ "<" +b);
        }
        if(a>b){
            System.out.println(a+ ">" +b);
        }
        if(a<=b){
            System.out.println(a+ "<=" +b);
        }
        if(a>=b){
            System.out.println(a+ ">=" +b);
        }
        
    }
    
}
