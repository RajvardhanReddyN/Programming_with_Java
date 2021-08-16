import java.util.Scanner;



class floydstar
{
    public static void main(String[] args)
    {
        int i,j,Rows;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : " );
        Rows = obj.nextInt();
        
        for(i=0;i<=Rows;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
      
    }
}
