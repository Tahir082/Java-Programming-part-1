package labprob21;


public class LabProb21 {

    
    public static void main(String[] args) {
        int sum=0, i=1, count=0;
        while(true){
            int flag = 0;
            for (int j = 2; j <= i/2; j++){
                if(i%j == 0){
                    flag=1;
                    break;
                }
            }
            if(flag == 0 && i!= 1 ){
                    System.out.println(i);
                    count++;
                    sum=sum+i;
            }
            if(count==100){
                break;
            }
            i++;
        }
        System.out.println("Sum of the first 100 prime numbers: " +sum);
    }
    
}
