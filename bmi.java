
package Bmi;


public class bmi {
   
   double bmi; 
   
   void setBmi(double bb, double tb) 
   {
       bmi=bb/(tb*tb);
   }
   
   double getBmi()
   {
       
        if (bmi < 18)
        {
            System.out.println("KURUS");
        }
        
        else if (bmi > 18.5 && bmi <=24.5)
        {
            System.out.println("NORMAL");
        }    
        
        else if (bmi > 24.5 && bmi <=30)
        {
            System.out.println("GEMUK");
        }
        
        else if (bmi > 30)
        {
            System.out.println("OBESITAS");
        }
    return bmi;
   }
   
}

