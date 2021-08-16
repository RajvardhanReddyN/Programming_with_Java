import java.util.Scanner;

class BasicCalc
{
    static int x,y,s,p;
    
    public static void input()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        x=S.nextInt();
        System.out.println("Enter 2nd Number : ");
        y=S.nextInt();
    }
    
    void sum()
    {
        s=x+y;
        System.out.println("Sum = " + s);
    }
    
    void pro()
    {
        p=x*y;
        System.out.println("Product = " + p);
    }
    
    public static void main(String[] args)
    {
        BasicCalc obj = new BasicCalc();
        obj.input();
        obj.sum();
        obj.pro();
        
    }
}