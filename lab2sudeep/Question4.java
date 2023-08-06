package lab2sudeep;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your years of exaperience");
        int exp=sc.nextInt();
        System.out.println("Enter your salary");
        int salary=sc.nextInt();
        
        if(exp>=5){
            salary=salary+(salary*20/100);
        }
        else{
            salary=salary+(salary*10/100);
        }
        System.out.println("Your new salary is:"+salary);
        
    }
}
