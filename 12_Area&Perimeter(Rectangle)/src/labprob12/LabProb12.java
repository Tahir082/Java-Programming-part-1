
package labprob12;

import static java.lang.Math.pow;
import java.util.Scanner;


public class LabProb12 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Type width: ");
        double width= input.nextDouble();
        System.out.println("Type Height: ");
        double height= input.nextDouble();
        double area= width*height;
        double perimeter= 2*(width+height);
        
        System.out.println("The Perimeter of the Rectangle is: "+perimeter);
        System.out.println("The Area of the Rectangle is: "+area);
    }
    
}
