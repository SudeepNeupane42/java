
package lab2sudeep;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        String value=(num%2==0)?"even":"odd";
        System.out.println("The number is "+value);
    }
}
