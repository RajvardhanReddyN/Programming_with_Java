import java.io.*;

class Initials
{
    public static void main(String[] args)throws IOException
    {
        String str;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Name with First, Middle & Last Names : ");
        str = BR.readLine();
        str =  " " + str;
        String str1 = "";
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                str1=str1+str.charAt(i+1)+".";
            }
        }
        
        System.out.println("Initials of the Given Name is : " + str1);
    }
}
