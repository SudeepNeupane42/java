
package Lab3;

public class Interest {
  static int totalCalculationCount=0;
  
  public void calculateSimpleInterest(double p,double t,double r){
      double i=(p*t*r)/100;
      System.out.println("Siple interest is: "+i);
      totalCalculationCount++;
  }
  
  public void calculateCompoundInterest(double p,double r,double n,double t){
      

      Double i=p*(Math.pow(1+r/n,t*n)-1);
      System.out.println("Compound interest is "+i);
      totalCalculationCount++;
  }
  
  static int totalCalculationCount(){
      return totalCalculationCount;
  }
}
