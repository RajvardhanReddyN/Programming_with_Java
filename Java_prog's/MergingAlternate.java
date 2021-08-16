import java.io.*;

class MergingAlternate
{
    public static void main(String args[])throws IOException
    {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Size of the Arrays : ");
        int l = Integer.parseInt(BR.readLine());
        int x[]=new int[l];
        int y[]=new int[l];
        int z[]=new int[l*2];
        
        System.out.println("Enter the Elements of the 1st Array : ");
        
        for(int i=0;i<l;i++)
        {
            x[i]=Integer.parseInt(BR.readLine());
        }
        
        System.out.println("Enter the Elements of the 2nd Array : ");
        
        for(int i=0;i<l;i++)
        {
            y[i]=Integer.parseInt(BR.readLine());
        }
        
        int j=0,k=0;
        
        for(int i=0;i<z.length;i++)
        {
            if(i%2==0)
            {
                z[i]=x[j++];
            }
            
            else
            {
                z[i]=y[k++];
            }
            
           
            
        }
        
        for(int i=0;i<z.length;i++)
        {
               System.out.print(z[i] + " ");
               System.out.println();
        }
    }
}