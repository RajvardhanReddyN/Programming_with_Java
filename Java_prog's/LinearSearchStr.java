import java.io.*;

class LinearSearchStr
{
    public static void main(String[] args)throws IOException
    {
        String Arr[] = new String[10];
        boolean flag=false;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Elements : ");
        
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=(BR.readLine());
        }
        
        System.out.print("Enter the Word that has to be searched : ");
        String S = (BR.readLine());
        
        for(int i=0;i<Arr.length;i++)
    {
        if(Arr[i].equalsIgnoreCase(S))
        {
            System.out.println("Word found at Index = " + i);
            flag=true;
            break;
        }
    }
    
    if(flag==false)
    {
        System.out.println("Word not found.");
    }
    
}
    
    
}