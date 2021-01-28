
package labprob8;

import java.util.Scanner;


public class LabProb8 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int np=0;
        System.out.println("Type in a Number: ");
        int num= input.nextInt();
        int prime_count=0;
        for(int i = 1; i <= num; i++){
            int flag = 0;
            for (int j = 2; j <= i/2; j++){
                if(i%j == 0){
                    flag=1;
                    break;
                }
            }
            if(flag == 0 && i!= 1 ){
                    prime_count++;
                    
            }  
        }
        System.out.println("There are "+prime_count+" prime numbers between 1 and "+num);
    }
    
}
