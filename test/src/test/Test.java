/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import java.util.Scanner;



/**
 *
 * @author USER
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in= new Scanner(System.in);
        double a, b;
        a = in.nextDouble();
        b=Math.sqrt(a);
        System.out.println("You typed: " +a);
        System.out.println("Square root of typed value: " +b);
    }
    
}
