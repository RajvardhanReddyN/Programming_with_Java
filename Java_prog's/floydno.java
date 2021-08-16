import java.util.Scanner;

class floydno
{
    public static void main(String[] args)
    {
        int i,j,a=1,row;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        row = obj.nextInt();
        
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(a + " ");
                a++;
            }
            
            System.out.println();
        }
        
    }  
}        
       
        
        
    
