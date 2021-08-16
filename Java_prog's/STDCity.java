import java.util.Scanner;

class STDCity
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the Length of the Array : ");
        int L = S.nextInt();
        
        String City[]=new String[L];
        int STDCode[]=new int[L];
        
        for(int i=0;i<L;i++)
        {
           System.out.println("Enter the City : ");
           City[i]=S.next();
           
           System.out.println("Enter the City Code : ");
           STDCode[i]=S.nextInt();
        }
        
        System.out.print("Enter the City Name to search the STD Code : ");
        String Search = S.next();
        boolean flag=false;
        
        for(int i=0;i<L;i++)
        {
            if(Search.equalsIgnoreCase(City[i])==true)
            {
            System.out.println("STD Code of " + Search + " City " + STDCode[i]);
            flag=true;
            break;
            }
        }
        
        if(flag==false)
        {
            System.out.println("There is no such city.");
        }
           
           
           
           
           
           
           
        
    }
}