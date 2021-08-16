import java.util.Scanner;

public class PrimeNum1 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the 1st Number : ");
        int start = obj.nextInt();
        
        System.out.println("Enter the 2nd Number : ");
        int end = obj.nextInt();
        
        System.out.println("\nThe Prime Numbers are\n");
        
        int i = start;
        
        for(i=start;i<end;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
               
            }
        }
    }
    
    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        
        return true;
    }

}
