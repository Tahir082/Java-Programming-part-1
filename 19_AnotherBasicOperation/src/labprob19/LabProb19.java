
package labprob19;

import java.util.Scanner;


public class LabProb19 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Type in 1st Number: ");
        int a= input.nextInt();
        System.out.println("Type in 2nd Number: ");
        int b= input.nextInt();
        System.out.println("Type in 3rd Number: ");
        int c= input.nextInt();
        boolean result;
        if(a>=20 || b>=20 || c>=20){
            if(a<b-c || b<a-c || c<a-b|| a<c-b|| b<c-a|| c<b-a){
                result=true;
                System.out.println("One of the given numbers2 is equal or more than 20 and less than the subtractions of others.");
                System.out.println("So, the result is: "+result);
            }
            else{
            result=false;
            System.out.println("One of the given numbers is NOT equal or more than 20 and less than the subtractions of others.");
            System.out.println("So, the result is: "+result);
        }
            
            
        }
        else{
            result=false;
            System.out.println("One of the given number is NOT equal or more than 20 and less than the subtractions of others.");
            System.out.println("So, the result is: "+result);
        }
    }
    
}
