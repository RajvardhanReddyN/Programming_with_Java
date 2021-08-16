import java.io.*;

class StrHandling
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        System.out.println("Enter a String : ");
        String str = BR.readLine();
        int I = str.indexOf('o');
        System.out.println("Index of the Letter 'o'is " + I);
        int LI = str.lastIndexOf('o');
        System.out.println("Last Index of Letter o " + LI);
        char c = str.charAt(6);
        System.out.println("Character at Index 6 is " + c);
        boolean S = str.startsWith("s");
        boolean R = str.endsWith("a");
        System.out.println("Whether starts with s : " + S);
        System.out.println("Whether ends with A : " + R);
        
        
        
        
    }
}