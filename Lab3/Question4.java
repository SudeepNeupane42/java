/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author student3
 */
public class Question4 {
    public static void main(String[] args) {
        Employee2 e1=new Employee2();
        Employee2 e2=new Employee2("shyam",2062,"Biratnagar");
        Employee2 e3=new Employee2("Jeevan",2065,"Pokhara");
        
        System.out.println("Name        Year Of Joining    Address");
        System.out.println(e1.getName()+"          "+e1.getYoj()+"                 "+e1.getAddress());
        System.out.println(e2.getName()+"        "+e2.getYoj()+"                 "+e2.getAddress());
        System.out.println(e3.getName()+"       "+e3.getYoj()+"                 "+e3.getAddress());
    }
}
