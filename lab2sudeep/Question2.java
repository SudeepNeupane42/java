package lab2sudeep;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        //addition
        int sum=a+b;
        System.out.println("sum is "+sum);
        
        //subtraction
        int diff=a-b;
        System.out.println("difference is "+diff);
        
        //multiplication
        int mul=a*b;
        System.out.println("Product is "+mul);
        
        //division
        int div=a/b;
        System.out.println("Division is "+div);
        
        //modulus
        int mod=a%b;
        System.out.println("Remainder is "+mod);
        
    }
}
