import java.io.*;

class SelectionSort

{
    public static void Sort(int Arr[])
    {
        int MV,MI,temp,i,j;
        
        
        for(i=0;i<Arr.length-1;i++)
        {
            MV=Arr[i];
            MI=i;
            
            for(j=i+1;j<Arr.length;j++)
            {
                if(Arr[j]<MV)
                {
                    MV=Arr[j];
                    MI=j;
                }
            }
            
            temp=Arr[i];
            Arr[i]=Arr[MI];
            Arr[MI]=temp;
            
            
        }
        
        System.out.println("Sorted Array is : ");
        
        for(i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i] + " ");
        }
    }
}
