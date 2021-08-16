import java.io.*;
class BubbleSort
 
 {
     public static void main(String[] args)throws IOException
     {
         int Arr[]=new int[10];
         int i,j;
         BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter 10 Elements : ");
         for(i=0;i<Arr.length;i++)
         {
             Arr[i]=Integer.parseInt(BR.readLine());
         }
         
         for(i=0;i<Arr.length-1;i++)
         {
             for(j=0;j<Arr.length-1-i;j++)
             {
                 if(Arr[j]>Arr[j+1])
                 {
                    int Temp=Arr[j];
                    Arr[j]=Arr[j+1];
                    Arr[j+1]=Temp; 
                    
                 }
             }
         }
         
         System.out.println("Sorted Array is given below : ");
         for(i=0;i<Arr.length;i++)
         {
             System.out.println(Arr[i] + " ");
         }
         
     }
 }
 
