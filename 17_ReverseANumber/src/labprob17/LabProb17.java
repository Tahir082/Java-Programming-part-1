
package labprob17;

import static java.lang.Math.abs;
import java.util.Scanner;


public class LabProb17 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Type in a Number: ");
        int num= input.nextInt();
        int get_rev;
        if(num<0) {
            num= abs(num);
        }
        get_rev=rev(num);
        
        System.out.println("Reverse of the given Number is: " +get_rev);
    }
    
    public static int rev(int n){
        int reverse=0, r=0;
        while(n!=0){
            r= n%10;
            reverse= reverse*10+r;
            n=n/10;
            
        }
        return reverse;
    }
    
}
