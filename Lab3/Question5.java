
package Lab3;

import java.util.Scanner;


public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of users: ");
        int n=sc.nextInt();
        String name,address;
        int age;
        Person[] arr = new Person[n];
        for(int i=0;i<n;i++){
            System.out.print("enter name: ");
            name=sc.next();
            System.out.print("enter the address: ");
            address=sc.next();
            System.out.print("enter the age: ");
            age=sc.nextInt();
            Person p=new Person(name,age, address);
            arr[i]=p;   
        }
        
        System.out.println("\nthe details of the youngest person are: ");
        Person small=arr[0];
        for(int i=0;i<n;i++){
            if (arr[i].getAge() <small.getAge()){
                small=arr[i];
            }     
        }
        System.out.println("name= "+small.getName()+"\nage= "+small.getAge()+"\naddress= "+small.getAddress());
    }
}
