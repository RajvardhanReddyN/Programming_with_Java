import java.io.*;

class WordsSent
{
    public static void main()throws IOException
    {
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        
        //BufferedReader BR = new BufferedReader(new InputStreamReader(System.in);)
        
        String str;
        int count = 0;
        System.out.println("Enter a Sentence : ");
        str = BR.readLine().trim();
        str = str + " ";
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                count++;
            }
            
            
        }
        
        System.out.println("Number of Words in a Sentence : " + count);
        
        
    }
}