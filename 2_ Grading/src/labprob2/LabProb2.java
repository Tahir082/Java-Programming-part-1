
package labprob2;

import java.util.Scanner;


public class LabProb2 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        while(true){
            System.out.println("Type in your obtained marks: ");
            String grade;
            double marks =input.nextInt();
            if(marks< 25){
                grade="F";
            }
            else if(marks >=25 && marks< 45){
                grade="E";
            }
            else if(marks >=45 && marks< 50){
                grade="D";
            }
            else if(marks >=50 && marks< 60){
                grade="C";
            }
            else if(marks >=60 && marks< 80){
                grade="B";
            }
            else if(marks >=80 && marks<=100){
                grade="A";
            }
            else
                grade="Invalid Input!! Try Again!";
            
            System.out.println("Your Grade: " + grade);
            
        }
       
        
    }
    
}
