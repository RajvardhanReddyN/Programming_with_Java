import java.util.Scanner;

public class nCr 

{
    public static int fact(int num)
    {
        int fact=1,i;
        
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        
        return fact;
    }
    
    public static void main(String[] args)
    {
        int n,r;
        Scanner obj =  new Scanner(System.in);
        
        System.out.println("Enter the Value of n : ");
        n = obj.nextInt();
        
        System.out.println("Enter the Valuer of r : ");
        r = obj.nextInt();
        
        System.out.println("NCR = " + (fact(n)/(fact(n-r)*fact(r))));
        System.out.println("NPR = " + (fact(n)/(fact(n-r))));
        
        
    }
}
