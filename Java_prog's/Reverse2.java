import java.io.*;

class Reverse2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        System.out.println("'Enter a String : ");
        String s1 = BR.readLine();
        String s2 = "";
        
        for(int i=s1.length()-1; i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        
        System.out.println("Answer : " + s2);
        
         if(s1.equalsIgnoreCase(s2)==true)
    
    {
        System.out.println("It is a Palindrome.");
    }
    
    else
    {
        System.out.println("It is not a Palindrome.");
    }
        
        
    }
}