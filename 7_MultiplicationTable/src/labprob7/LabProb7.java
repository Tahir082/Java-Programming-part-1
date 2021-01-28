
package labprob7;

import java.util.Scanner;


public class LabProb7 {

   
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Type in a Number: ");
        int num= input.nextInt();
        int mt=0;
        System.out.println("Multiplication Table up to 10 for '"+num+"'8");
        for(int i=1; i<=10; i++){
           mt= num*i;
            System.out.println(num +" X "+ i +" = "+mt);
        }
    }
    
}
