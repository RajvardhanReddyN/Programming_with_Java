//Program to Count Number of Digits before & after Decimal

import java.io.*;

class Decimal
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number with Decimal places : ");
        double d = Double.parseDouble(BR.readLine());
        String S = Double.toString(d);
        int b = S.indexOf('.');
        int a = (S.length()-1)-b;
        System.out.println("Digits before Decimal : " + b);
        System.out.println("Digits after Decimal : " + a);
        
        
    }
}