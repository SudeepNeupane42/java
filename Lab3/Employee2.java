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
public class Employee2 {
    
    private String name;
    private int yearOfJoining;
    private String address;
    
    public Employee2(String a,int b,String c){
        this.name=a;
        this.yearOfJoining=b;
        this.address=c;
    }
     public Employee2(){
        this.name="Ram";
        this.address="kathmandu";
        this.yearOfJoining=2056;
    }
   public String getName( ){
       return this.name; 
    }  
   
   public int getYoj( ){
       return this.yearOfJoining; 
    } 
   
   public String getAddress( ){
       return this.address; 
    } 
 
            
}
