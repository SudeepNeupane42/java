
package lab2sudeep;

public class Question10 {
    public static void main(String[] args) {
        System.out.println("The prime numbers are: ");
        for(int i=2;i<=50;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            
             if (count==2){
             System.out.println(i+" ");
            }
        }
        
    }
}
