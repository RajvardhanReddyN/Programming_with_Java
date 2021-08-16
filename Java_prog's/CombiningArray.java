import java.io.*;

class CombiningArray
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the Size of the 1st Array : ");
        int xL=Integer.parseInt(BR.readLine());
        int x[]=new int[xL];
        
        System.out.println("Enter the Elements for the 1st Array");
        {
            for(int i=0;i<xL;i++)
            {
                x[i]=Integer.parseInt(BR.readLine());
            }
            
            System.out.println("Enter the Size of the 2nd Array");
            int yL=Integer.parseInt(BR.readLine());
            int y[]=new int[yL];
            
            System.out.println("Enter the Elements for the 2nd Array");
            {
                for(int j=0;j<yL;j++)
                {
                    y[j]=Integer.parseInt(BR.readLine());
                }
            }
            
            int zL=xL+yL;
            int z[]=new int[zL];
            
            for(int i=0;i<xL;i++)
            {
                z[i]=x[i];
            }
            
            for(int i=xL,j=0;i<zL;i++,j++)
            {
                z[i]=y[j];
            }
            
            for(int i=0;i<zL;i++)
            {
                System.out.print(z[i] + " ");
                System.out.println();
            }
            
        }
        
        
        
    }
}
