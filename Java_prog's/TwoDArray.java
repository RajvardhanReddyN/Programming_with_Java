import java.io.*;

class TwoDArray
{
    public static void main(String[] args)throws IOException
    {
        String[] Name = new String[5];
        int M[][] = new int[5][4];
        int sum[] = new int[5];
        int s = 0;
        int i,j;
        
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        
        for(i=0;i<5;i++)
        {
            System.out.print("Enter the Name of the Student : ");
            Name[i]=BR.readLine();
       
        
        for(j=0;j<4;j++)
        {
            System.out.println("Enter the Marks of the Subject " + (j+1) + " : " );
            M[i][j]=Integer.parseInt(BR.readLine());
            s=s+M[i][j];
            sum[i]=s;
            
        }
        
        s=0;
        
        }
        
        System.out.println("Name t\t Total Marks  ");
        
        for(i=0;i<5;i++)
        {
            System.out.println(Name[i] + "\t" + sum[i] );
        }
      
        
        
            
            
            
        
        
        
    }
}