import java.io.*;

class ReverseSent
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        
        System.out.println("Enter a Sentence : ");
        String sent = BR.readLine();
        
        sent = " " + sent;
        String s1 = "";
        
        for(int i=sent.length()-1;i>=0;i--)
        {
            s1 = sent.charAt(i)+s1;
            
            if(sent.charAt(i)== ' ')
            {
                System.out.println(s1);
                s1="";
            }
            
            
            
        }
        
        
        
        
    }
}