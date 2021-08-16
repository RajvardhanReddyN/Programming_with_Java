import java.io.*;

class BinarySearch
{
    public static void main(String[] args)throws IOException
    {
        int Arr[]=new int[10];
        int i;
        int F=0, L=Arr.length-1, M;
        boolean flag = false;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Elements : ");
        
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=Integer.parseInt(BR.readLine());
        }
        
        System.out.println("Enter the Element to be Searched : ");
        int S = Integer.parseInt(BR.readLine());
        
        while(F<=L)
        {
            M=(F+L)/2;
            
            if(S == Arr[M])
            {
                System.out.println("Element is available at Index : " + M);
                flag=true;
                break;
                
         
            }
            
            else if(S>Arr[M])
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