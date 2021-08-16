import java.io.*;

class LargeSmall
{
    public static void main(String[] args)throws IOException
    {
        double Arr[]=new double[10];
        double Largest = Arr[0];
        double Smallest = Arr[0];
        int i,j;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in ));
        System.out.println("Enter Elements : ");
        
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=Double.parseDouble(BR.readLine());
        }
        
        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]>=Largest)
            {
                Largest = Arr[i];
            }
        }
        
        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]<Smallest)
            {
                Smallest = Arr[i];
            }
        }
        
        
        System.out.println("Largest Element : " + Largest);
        System.out.println("Smallest Element : " + Smallest);
    }
    
   
}
