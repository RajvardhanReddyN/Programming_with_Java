import java.io.*;

class ImportIO

{
    public static void main(String[] args)throws IOException
    {
        String Ph_M;
        int Price;
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        System.out.println("What is the Model of your phone ? ");
        Ph_M = BR.readLine();
        System.out.println("What is the Price of your mobile ? ");
        Price = Integer.parseInt(BR.readLine());
        System.out.println(" You own " + Ph_M + " of Price " + Price);
        
        
    }
}