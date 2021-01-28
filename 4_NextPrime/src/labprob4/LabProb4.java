
package labprob4;
import java.util.Scanner;

public class LabProb4 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int np=0;
        System.out.println("Type in a Number: ");
        int a= input.nextInt();
        np= nextPrime(a);
        System.out.println("nextPrime("+a+")->" + np);
        
        
    }

    public static int nextPrime(int n) {
        
        int flag=0;
        for(int i = 2; i < n; i++) {
            if((n % i) == 0) {
                flag=1;
                break;
            }
            
        }
        while(flag==1){
            n++;
            for(int i = 2; i < n; i++) {
            if((n % i) == 0) {
                flag=1;
                break;
            }
            else{
                flag=0;
            }
            
        }
            
        }
        return n;
       
        
            
    }
}

    

