import java.io.*;

class StrHandling3
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        System.out.println("Enter a String : ");
        String s1 = BR.readLine();
        System.out.println("Enter another String : ");
        String s2 = BR.readLine();
        System.out.println("Comparision Result :  " + (s1.compareTo(s2)));
        
        
        
        
    }
}