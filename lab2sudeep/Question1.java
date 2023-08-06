                                                                                                                
package lab2sudeep;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //a
        char value1='m';
        int intvalue1 =value1;
        char charvalue1=(char)intvalue1;
        
        System.out.println("original value = "+value1);
        System.out.println("value in integer = "+intvalue1);
        System.out.println("value in char again = "+charvalue1);
        
         //b
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a double a value and integer value: ");
        int value2=sc.nextInt();
        double value3=sc.nextDouble();
         //integer to double
         double doublevalue=value2;
         //double to integer
         int intvalue3=(int)value3;
         
         System.out.println("intger value to double = "+doublevalue);
         System.out.println("double value to integer = "+intvalue3);
    }
}
