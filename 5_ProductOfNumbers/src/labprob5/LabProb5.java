/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprob5;

import java.util.Scanner;


public class LabProb5 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Type in 1st Number: ");
        int a= input.nextInt();
        System.out.println("Type in 2nd Number: ");
        int b= input.nextInt();
        int c= a*b;
        System.out.println("The product of given two numbers: " +a+ " X " +b+ " = " +c);

        
    }
    
}
