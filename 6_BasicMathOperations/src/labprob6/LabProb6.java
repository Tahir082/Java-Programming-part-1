/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprob6;

import java.util.Scanner;


public class LabProb6 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Type in 1st Number: ");
        int a= input.nextInt();
        System.out.println("Type in 2nd Number: ");
        int b= input.nextInt();
        int sum= a+b;
        int sub= a-b;
        int mul= a*b;
        double div= a/b;
        System.out.println("Addition: " +a+ " + " +b+ " = " +sum);
        System.out.println("Substraction: " +a+ " - " +b+ " = " +sub);
        System.out.println("Multiplication " +a+ " X " +b+ " = " +mul);
        System.out.println("Division " +a+ "/" +b+ " = " +div);
        
    }
    
}
