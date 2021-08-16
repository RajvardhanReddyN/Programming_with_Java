import java.util.Scanner;

class UserDefined1

{
   public static double calc()
    {
      int x,y;
      
      double Diff;
      
      Scanner obj = new Scanner(System.in);
      
      System.out.print("Enter the value of x : ");
      
      x = obj.nextInt();
      
      System.out.print("Enter the value of y : ");
      
      y = obj.nextInt();
      
      Diff = x-y;
      
      return(Diff);
       
    
    
    }
 }