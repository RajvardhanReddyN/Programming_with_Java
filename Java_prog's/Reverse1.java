import java.io.*;

class Reverse1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        System.out.println("'Enter a String : ");
        String s1 = BR.readLine();
        String s2 = "";
        
        for(int i=0; i<s1.length();i++)
        {
            s2=s1.charAt(i)+s2;
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