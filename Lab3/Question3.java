
package Lab3;

public class Question3 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        
        e1.setName("ram");
        e1.setAddress("Kathmandu");
        e1.setYoj(2056);
        
        e2.setName("shyam");
        e2.setAddress("Biratnagar");
        e2.setYoj(2062);
        
        e3.setName("jeevan");
        e3.setAddress("pokhara");
        e3.setYoj(2065);
        
        System.out.println("Name        Year Of Joining    Address");
        System.out.println(e1.getName()+"          "+e1.getYoj()+"                 "+e1.getAddress());
        System.out.println(e2.getName()+"        "+e2.getYoj()+"                 "+e2.getAddress());
        System.out.println(e3.getName()+"       "+e3.getYoj()+"                 "+e3.getAddress());
    }
}
