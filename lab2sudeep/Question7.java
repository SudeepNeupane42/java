package lab2sudeep;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int org=num;
        int rem=0;
        int sum=0;
        while(num!=0){
            rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        System.out.println("The reverse of "+org+" is "+sum);
    }
}
