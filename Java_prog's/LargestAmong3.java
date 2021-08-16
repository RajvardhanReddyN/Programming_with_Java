import java.util.Scanner;

public class LargestAmong3 

{
    public static void main (String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int a,b,c;
        int l;
        
        System.out.println("Enter the First Number : ");
        a = obj.nextInt(); 
         
        System.out.println("Enter the Second Number : ");
        b = obj.nextInt(); 
        
        System.out.println("Enter the Third Number : ");
        c = obj.nextInt(); 
        
        l = a>b?(a>c?a:c):(b>c?b:c);
        
        System.out.println("The Largest Number is = " + l );
        
        

    }
    
}
