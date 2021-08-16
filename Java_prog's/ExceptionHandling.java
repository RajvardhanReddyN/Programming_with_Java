import java.io.*;
class ExceptionHandling
{
    public static void main()throws IOException
    {
        int Grade;
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        System.out.println("Enter your Grade : ");
        
        try
        
        {
            Grade = Integer.parseInt(BR.readLine());
            System.out.println(" You are in Class " + Grade);
        }
        
        catch(Exception ex)
        {
             System.out.println("End of the Program : ");
        }
        
        
    }
}