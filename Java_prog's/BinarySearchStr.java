import java.io.*;

class BinarySearchStr
{
    public static void main(String[] args)throws IOException
    {
        String Arr[]=new String[10];
        int i;
        int F=0, L=Arr.length-1, M;
        boolean flag = false;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Elements : ");
        
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=BR.readLine();
        }
        
        System.out.println("Enter the Word to be Searched : ");
        String S = BR.readLine();
        
        while(F<=L)
        {
            M=(F+L)/2;
            
            if(S.compareTo(Arr[M])==0)
            {
                System.out.println("Element is available at Index : " + M);
                flag=true;
                break;
                
         
            }
            
            else if(S.compareTo(Arr[M])>0)
            {
                F=M+1;
            }
            
            else
            {
                L=M-1;
            }
        }
        
        if(!flag)
        {
            System.out.println("Element not found.");
        }
        
        
        
    }
}