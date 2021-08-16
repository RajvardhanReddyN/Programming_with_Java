import java.io.*;

class LinearSearch
{
    public static void main(String[] args)throws IOException
    {
        double Arr[] = new double[10];
        boolean flag=false;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Elements : ");
        
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=Double.parseDouble(BR.readLine());
        }
        
        System.out.print("Enter the Value that has to be searched : ");
        Double S = Double.parseDouble(BR.readLine());
        
        for(int i=0;i<Arr.length;i++)
    {
        if(Arr[i]==S)
        {
            System.out.println("Element found at Index = " + i);
            flag=true;
            break;
        }
    }
    
    if(flag==false)
    {
        System.out.println("Element not found.");
    }
    
}
    
    
}