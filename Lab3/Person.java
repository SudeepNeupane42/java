
package Lab3;


public class Person {
    
    private String name;
    private int age;
    private String address;
    
    public Person(String a,int b,String c){
        this.name=a;
        this.age=b;
        this.address=c;
    }

   public String getName( ){
       return this.name; 
    }  
   
   public int getAge( ){
       return this.age; 
    } 
   
   public String getAddress( ){
       return this.address; 
    } 
 
            
}

}
