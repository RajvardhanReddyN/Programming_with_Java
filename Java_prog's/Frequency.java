import java.io.*;

class Frequency
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String str = BR.readLine();
        str = str.toUpperCase();
        int Count=0;
        for(char j='A';j<='Z';j++)
        {
        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)==j)
           {
               Count++;
           }
           
        
        }
        
        if(Count!=0)
        {
        
        System.out.println("Frequency of "+ j + ":" + Count );
        Count=0;
        }
        } 
        
    }  
}        
        
        
        
        
    



