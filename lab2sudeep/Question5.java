
package lab2sudeep;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three integer numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        if(a>b){
            if(a>c){
                System.out.println(a+" is largest number");
            }    
        }
        else if(b>a){
            if(b>c){
                System.out.println(b+"  is largest number");
            }
        }
        else{
            System.out.println(c+"is largest number");
        }
    }
 
}
