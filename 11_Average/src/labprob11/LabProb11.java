/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprob11;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LabProb11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Type in 1st Number: ");
        int a= input.nextInt();
 
        System.out.println("Type in 2nd Number: ");
        int b= input.nextInt();
       
        System.out.println("Type in 3rd Number: ");
        int c= input.nextInt();
        
        double avg= (a+b+c)/3;
        System.out.println("The Average of the given three numbers: "+ avg);
    }
    
}
