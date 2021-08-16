import java.io.*;

class StrHandling2
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        System.out.print("Enter a String : ");
        String s1 = BR.readLine();
        String s2 = s1.substring(5);
        System.out.println("Answer : " + s2);
        String s3 = s1.substring(6,9);
        System.out.println("Answer : " + s3);
        
    }
}