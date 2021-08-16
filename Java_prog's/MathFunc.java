import java.io.*;

class MathFunc
{
    public static void main(String[] args)throws IOException
    {
        double a,b,c;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Base : ");
        a = Double.parseDouble(BR.readLine());
        System.out.println("Enter the Power : ");
        b =  Double.parseDouble(BR.readLine());
        c = Math.pow(a,b);
        System.out.println("Ans : " + c);
        System.out.println("Square Root : " + Math.sqrt(a));
        
    }
}