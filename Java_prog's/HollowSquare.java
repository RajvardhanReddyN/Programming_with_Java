import java.util.Scanner;
class HollowSquare
{
    public static void main(String[] args)
    {
        int Rows;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number of Rows required : ");
        Rows = obj.nextInt();
        for(int i=0;i<=Rows;i++)
        {
            for(int j=0;j<=Rows;j++)
            {
                if(i == 0||i == Rows  ||j == 0 ||j == Rows)
                {
                    System.out.print("*");
                }
                
                else
                {
                    System.out.print(" ");
                }
                
                
            }
            
            System.out.println(" ");
        }
        
        
    }
}
