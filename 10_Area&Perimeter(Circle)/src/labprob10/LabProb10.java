
package labprob10;

import static java.lang.Math.pow;
import java.util.Scanner;


public class LabProb10 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Type in radius of a circle: ");
        double rad= input.nextDouble();
        double area= 3.1416 * pow(rad,2);
        double perimeter= 2* 3.1416* rad;
        
        System.out.println("The Perimeter of the Circle is: "+perimeter);
        System.out.println("The Area of the Circle is: "+area);
    }
    
}
