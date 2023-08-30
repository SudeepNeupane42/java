
package Lab3;


public class Question6 {
    public static void main(String[] args) {
        System.out.println("when p=10000, time= 5 years and rate= 7.5 years");
        Interest i=new Interest();
        i.calculateSimpleInterest(10000, 5, 7.5);
        System.out.println("\nwhen principle= 50000, rate=5.5%, n= 3 and time= 5 years");
        i.calculateCompoundInterest(50000, 5.5, 3, 5);
        System.out.println("\nnumber of calculations= "+Interest.totalCalculationCount());
    }
}
