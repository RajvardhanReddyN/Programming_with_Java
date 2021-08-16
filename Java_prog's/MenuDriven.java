import java.util.Scanner;

class MenuDriven
{
    public static void main(String[] args)
    {
        int ch,n,i;
        Scanner S = new Scanner(System.in);
        System.out.println("Menu : \n1.To find Factorial\n2.To find Factors\nEnter your Choice");
        ch = S.nextInt();
        
        switch(ch)
        {
            case 1:
            int f=1;
            System.out.println("Enter the Number to find Factorial : ");
            n = S.nextInt();
             for(i=1;i<=n;i++)
             {
                 f=f*i;
             }
             
             System.out.println(n + "! = " + f);
             break;
             
             case 2:
             System.out.println("Enter a Number to find the Factors : ");
             n=S.nextInt();
             System.out.println("Factors of " + n + "are : ");
             for(i=1;i<=n;i++)
             {
                 if(n%i==0)
                 {
                     System.out.println(i + ",");
                     
                 }
                 
                 
             }
             
             break;
             
             default:
             
             System.out.println("Invalid Input.");
             
        }
    }
}