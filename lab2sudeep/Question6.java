
package lab2sudeep;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a weekday");
        int choice=sc.nextInt();
        
        switch (choice){
            
            case 1:
                System.out.println("sunday"); 
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:    
                System.out.println("saturday");
                break;
            default:
                System.out.println("No such choice");
                
        }   
    }      
}
