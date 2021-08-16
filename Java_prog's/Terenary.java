import java.util.Scanner;

class Terenary
{
    public static void main( String[] args)
    {
      
        Scanner obj = new Scanner(System.in);
        int x,y;
        double Q;
        
        System.out.print("Enter the value of x :" );
        x = obj.nextInt();
        
        System.out.print("Enter the value of y :" );
        y = obj.nextInt();
        
        Q = x>y?x/y:y/x;
        
        System.out.println("Quotient = " + Q);
        
    }
}
